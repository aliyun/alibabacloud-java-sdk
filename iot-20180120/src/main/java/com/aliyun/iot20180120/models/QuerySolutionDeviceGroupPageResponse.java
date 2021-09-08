// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySolutionDeviceGroupPageResponseData data;

    public static QuerySolutionDeviceGroupPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageResponse self = new QuerySolutionDeviceGroupPageResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySolutionDeviceGroupPageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySolutionDeviceGroupPageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySolutionDeviceGroupPageResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySolutionDeviceGroupPageResponse setData(QuerySolutionDeviceGroupPageResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySolutionDeviceGroupPageResponseData getData() {
        return this.data;
    }

    public static class QuerySolutionDeviceGroupPageResponseDataListItemName extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupDesc")
        @Validation(required = true)
        public String groupDesc;

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Long deviceCount;

        public static QuerySolutionDeviceGroupPageResponseDataListItemName build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseDataListItemName self = new QuerySolutionDeviceGroupPageResponseDataListItemName();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QuerySolutionDeviceGroupPageResponseDataListItemName setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseDataList extends TeaModel {
        @NameInMap("itemName")
        @Validation(required = true)
        public java.util.List<QuerySolutionDeviceGroupPageResponseDataListItemName> itemName;

        public static QuerySolutionDeviceGroupPageResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseDataList self = new QuerySolutionDeviceGroupPageResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseDataList setItemName(java.util.List<QuerySolutionDeviceGroupPageResponseDataListItemName> itemName) {
            this.itemName = itemName;
            return this;
        }
        public java.util.List<QuerySolutionDeviceGroupPageResponseDataListItemName> getItemName() {
            return this.itemName;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseData extends TeaModel {
        @NameInMap("PageId")
        @Validation(required = true)
        public Integer pageId;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("List")
        @Validation(required = true)
        public QuerySolutionDeviceGroupPageResponseDataList list;

        public static QuerySolutionDeviceGroupPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseData self = new QuerySolutionDeviceGroupPageResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySolutionDeviceGroupPageResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySolutionDeviceGroupPageResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySolutionDeviceGroupPageResponseData setList(QuerySolutionDeviceGroupPageResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySolutionDeviceGroupPageResponseDataList getList() {
            return this.list;
        }

    }

}
