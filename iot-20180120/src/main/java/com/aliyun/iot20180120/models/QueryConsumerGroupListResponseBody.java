// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public QueryConsumerGroupListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupId")
        public String groupId;

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
