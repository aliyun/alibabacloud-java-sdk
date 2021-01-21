// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
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
    public QueryFaceUserGroupAndDeviceGroupRelationResponseData data;

    public static QueryFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupAndDeviceGroupRelationResponse self = new QueryFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse setData(QueryFaceUserGroupAndDeviceGroupRelationResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserGroupAndDeviceGroupRelationResponseData getData() {
        return this.data;
    }

    public static class QueryFaceUserGroupAndDeviceGroupRelationResponseData extends TeaModel {
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

        public static QueryFaceUserGroupAndDeviceGroupRelationResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupAndDeviceGroupRelationResponseData self = new QueryFaceUserGroupAndDeviceGroupRelationResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseData setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
