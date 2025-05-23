// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRabbitmqPublishersResponseBody extends TeaModel {
    @NameInMap("authorizations")
    public java.util.List<ListRabbitmqPublishersResponseBodyAuthorizations> authorizations;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6599600A-20F6-556D-A15C-55EB9243BB24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>72</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRabbitmqPublishersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRabbitmqPublishersResponseBody self = new ListRabbitmqPublishersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRabbitmqPublishersResponseBody setAuthorizations(java.util.List<ListRabbitmqPublishersResponseBodyAuthorizations> authorizations) {
        this.authorizations = authorizations;
        return this;
    }
    public java.util.List<ListRabbitmqPublishersResponseBodyAuthorizations> getAuthorizations() {
        return this.authorizations;
    }

    public ListRabbitmqPublishersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRabbitmqPublishersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRabbitmqPublishersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRabbitmqPublishersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRabbitmqPublishersResponseBodyAuthorizations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-06-16T03:41:34Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>exchangeName</p>
         */
        @NameInMap("exchangeName")
        public String exchangeName;

        /**
         * <strong>example:</strong>
         * <p>TOPIC</p>
         */
        @NameInMap("exchangeType")
        public String exchangeType;

        @NameInMap("hostName")
        public String hostName;

        /**
         * <strong>example:</strong>
         * <p>MQ</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>5671</p>
         */
        @NameInMap("port")
        public Long port;

        /**
         * <strong>example:</strong>
         * <p>mqp-3b6cb9fa4751a6e5cd2682246</p>
         */
        @NameInMap("publisherId")
        public String publisherId;

        /**
         * <strong>example:</strong>
         * <p>MjoxODgwNzcwODY5MD***</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>virtualHost</p>
         */
        @NameInMap("virtualHost")
        public String virtualHost;

        public static ListRabbitmqPublishersResponseBodyAuthorizations build(java.util.Map<String, ?> map) throws Exception {
            ListRabbitmqPublishersResponseBodyAuthorizations self = new ListRabbitmqPublishersResponseBodyAuthorizations();
            return TeaModel.build(map, self);
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setPublisherId(String publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public String getPublisherId() {
            return this.publisherId;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListRabbitmqPublishersResponseBodyAuthorizations setVirtualHost(String virtualHost) {
            this.virtualHost = virtualHost;
            return this;
        }
        public String getVirtualHost() {
            return this.virtualHost;
        }

    }

}
