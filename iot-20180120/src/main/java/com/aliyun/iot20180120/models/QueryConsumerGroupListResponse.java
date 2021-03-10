// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryConsumerGroupListResponseData data;

    public static QueryConsumerGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupListResponse self = new QueryConsumerGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryConsumerGroupListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConsumerGroupListResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryConsumerGroupListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryConsumerGroupListResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryConsumerGroupListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupListResponse setData(QueryConsumerGroupListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryConsumerGroupListResponseData getData() {
        return this.data;
    }

    public static class QueryConsumerGroupListResponseDataConsumerGroupDTO extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static QueryConsumerGroupListResponseDataConsumerGroupDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupListResponseDataConsumerGroupDTO self = new QueryConsumerGroupListResponseDataConsumerGroupDTO();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupListResponseDataConsumerGroupDTO setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryConsumerGroupListResponseDataConsumerGroupDTO setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryConsumerGroupListResponseDataConsumerGroupDTO setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryConsumerGroupListResponseData extends TeaModel {
        @NameInMap("ConsumerGroupDTO")
        @Validation(required = true)
        public java.util.List<QueryConsumerGroupListResponseDataConsumerGroupDTO> consumerGroupDTO;

        public static QueryConsumerGroupListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupListResponseData self = new QueryConsumerGroupListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupListResponseData setConsumerGroupDTO(java.util.List<QueryConsumerGroupListResponseDataConsumerGroupDTO> consumerGroupDTO) {
            this.consumerGroupDTO = consumerGroupDTO;
            return this;
        }
        public java.util.List<QueryConsumerGroupListResponseDataConsumerGroupDTO> getConsumerGroupDTO() {
            return this.consumerGroupDTO;
        }

    }

}
