// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateFaceUserGroupAndDeviceGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserGroupAndDeviceGroupRelationResponseBody self = new UpdateFaceUserGroupAndDeviceGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody setData(UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData extends TeaModel {
        @NameInMap("ControlId")
        public String controlId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData self = new UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public UpdateFaceUserGroupAndDeviceGroupRelationResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
