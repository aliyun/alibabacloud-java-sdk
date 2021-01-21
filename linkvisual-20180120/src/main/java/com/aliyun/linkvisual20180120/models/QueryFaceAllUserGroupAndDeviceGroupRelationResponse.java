// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData data;

    public static QueryFaceAllUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupAndDeviceGroupRelationResponse self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setData(QueryFaceAllUserGroupAndDeviceGroupRelationResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData getData() {
        return this.data;
    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList extends TeaModel {
        @NameInMap("ControlId")
        @Validation(required = true)
        public String controlId;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("ControlType")
        @Validation(required = true)
        public String controlType;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList> list;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseData self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseData setList(java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseDataList> getList() {
            return this.list;
        }

    }

}
