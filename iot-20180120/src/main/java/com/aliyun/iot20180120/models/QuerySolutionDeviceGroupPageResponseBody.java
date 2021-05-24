// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QuerySolutionDeviceGroupPageResponseBodyData data;

    public static QuerySolutionDeviceGroupPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageResponseBody self = new QuerySolutionDeviceGroupPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySolutionDeviceGroupPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySolutionDeviceGroupPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySolutionDeviceGroupPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySolutionDeviceGroupPageResponseBody setData(QuerySolutionDeviceGroupPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySolutionDeviceGroupPageResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySolutionDeviceGroupPageResponseBodyDataListItemName extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("DeviceCount")
        public Long deviceCount;

        public static QuerySolutionDeviceGroupPageResponseBodyDataListItemName build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyDataListItemName self = new QuerySolutionDeviceGroupPageResponseBodyDataListItemName();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseBodyDataList extends TeaModel {
        @NameInMap("itemName")
        public java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> itemName;

        public static QuerySolutionDeviceGroupPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyDataList self = new QuerySolutionDeviceGroupPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataList setItemName(java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> itemName) {
            this.itemName = itemName;
            return this;
        }
        public java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> getItemName() {
            return this.itemName;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseBodyData extends TeaModel {
        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("List")
        public QuerySolutionDeviceGroupPageResponseBodyDataList list;

        public static QuerySolutionDeviceGroupPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyData self = new QuerySolutionDeviceGroupPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setList(QuerySolutionDeviceGroupPageResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySolutionDeviceGroupPageResponseBodyDataList getList() {
            return this.list;
        }

    }

}
