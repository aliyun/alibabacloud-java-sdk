// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public QueryDeviceGroupListResponseBodyData data;

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

    public static QueryDeviceGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupListResponseBody self = new QueryDeviceGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceGroupListResponseBody setData(QueryDeviceGroupListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupListResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceGroupListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceGroupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceGroupListResponseBodyDataGroupInfo extends TeaModel {
        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static QueryDeviceGroupListResponseBodyDataGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupListResponseBodyDataGroupInfo self = new QueryDeviceGroupListResponseBodyDataGroupInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupListResponseBodyDataGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupListResponseBodyDataGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupListResponseBodyDataGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupListResponseBodyDataGroupInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

    public static class QueryDeviceGroupListResponseBodyData extends TeaModel {
        @NameInMap("GroupInfo")
        public java.util.List<QueryDeviceGroupListResponseBodyDataGroupInfo> groupInfo;

        public static QueryDeviceGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupListResponseBodyData self = new QueryDeviceGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupListResponseBodyData setGroupInfo(java.util.List<QueryDeviceGroupListResponseBodyDataGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupListResponseBodyDataGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
