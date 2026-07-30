// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsResponseBody extends TeaModel {
    /**
     * <p>The response status code. Ok is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListConsumerGroupsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupsResponseBody self = new ListConsumerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerGroupsResponseBody setData(ListConsumerGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumerGroupsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The number of consumers in the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("consumerCount")
        public Long consumerCount;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>csg-8c13d2b4f8a1</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The creation time of the consumer group, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The consumer group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for online API caller grouping.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The gateway type. Valid values: API or AI.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>The consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-consumer-group</p>
         */
        @NameInMap("name")
        public String name;

        public static ListConsumerGroupsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupsResponseBodyDataItems self = new ListConsumerGroupsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupsResponseBodyDataItems setConsumerCount(Long consumerCount) {
            this.consumerCount = consumerCount;
            return this;
        }
        public Long getConsumerCount() {
            return this.consumerCount;
        }

        public ListConsumerGroupsResponseBodyDataItems setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListConsumerGroupsResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListConsumerGroupsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConsumerGroupsResponseBodyDataItems setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListConsumerGroupsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListConsumerGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The list of consumer groups.</p>
         */
        @NameInMap("items")
        public java.util.List<ListConsumerGroupsResponseBodyDataItems> items;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of consumer groups that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListConsumerGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupsResponseBodyData self = new ListConsumerGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupsResponseBodyData setItems(java.util.List<ListConsumerGroupsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListConsumerGroupsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListConsumerGroupsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumerGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConsumerGroupsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
