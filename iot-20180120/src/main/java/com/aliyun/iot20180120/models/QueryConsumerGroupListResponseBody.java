// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details about the consumer group. This parameter is returned if the call is successful. For more information, see ConsumerGroupDTO.</p>
     */
    @NameInMap("Data")
    public QueryConsumerGroupListResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of returned pages.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryConsumerGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupListResponseBody self = new QueryConsumerGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryConsumerGroupListResponseBody setData(QueryConsumerGroupListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConsumerGroupListResponseBodyData getData() {
        return this.data;
    }

    public QueryConsumerGroupListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryConsumerGroupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConsumerGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryConsumerGroupListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryConsumerGroupListResponseBodyDataConsumerGroupDTO extends TeaModel {
        /**
         * <p>The time when the consumer group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format. The time is displayed in UTC and accurate to milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the consumer group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static QueryConsumerGroupListResponseBodyDataConsumerGroupDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupListResponseBodyDataConsumerGroupDTO self = new QueryConsumerGroupListResponseBodyDataConsumerGroupDTO();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupListResponseBodyDataConsumerGroupDTO setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryConsumerGroupListResponseBodyDataConsumerGroupDTO setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryConsumerGroupListResponseBodyDataConsumerGroupDTO setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QueryConsumerGroupListResponseBodyData extends TeaModel {
        @NameInMap("ConsumerGroupDTO")
        public java.util.List<QueryConsumerGroupListResponseBodyDataConsumerGroupDTO> consumerGroupDTO;

        public static QueryConsumerGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupListResponseBodyData self = new QueryConsumerGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupListResponseBodyData setConsumerGroupDTO(java.util.List<QueryConsumerGroupListResponseBodyDataConsumerGroupDTO> consumerGroupDTO) {
            this.consumerGroupDTO = consumerGroupDTO;
            return this;
        }
        public java.util.List<QueryConsumerGroupListResponseBodyDataConsumerGroupDTO> getConsumerGroupDTO() {
            return this.consumerGroupDTO;
        }

    }

}
