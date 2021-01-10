// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserGroupAndDeviceGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupAndDeviceGroupRelationResponseBody self = new QueryFaceUserGroupAndDeviceGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody setData(QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData extends TeaModel {
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

        public static QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData self = new QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBodyData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

    }

}
