// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setData(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList extends TeaModel {
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ControlType")
        public String controlType;

        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("ControlId")
        public String controlId;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setList(java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
