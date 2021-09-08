// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceGroupListResponseData data;

    public static QueryDeviceGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupListResponse self = new QueryDeviceGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupListResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceGroupListResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceGroupListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceGroupListResponse setData(QueryDeviceGroupListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupListResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupListResponseDataGroupInfo extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupDesc")
        @Validation(required = true)
        public String groupDesc;

        public static QueryDeviceGroupListResponseDataGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupListResponseDataGroupInfo self = new QueryDeviceGroupListResponseDataGroupInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupListResponseDataGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupListResponseDataGroupInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceGroupListResponseDataGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupListResponseDataGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

    public static class QueryDeviceGroupListResponseData extends TeaModel {
        @NameInMap("GroupInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceGroupListResponseDataGroupInfo> groupInfo;

        public static QueryDeviceGroupListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupListResponseData self = new QueryDeviceGroupListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupListResponseData setGroupInfo(java.util.List<QueryDeviceGroupListResponseDataGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupListResponseDataGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
