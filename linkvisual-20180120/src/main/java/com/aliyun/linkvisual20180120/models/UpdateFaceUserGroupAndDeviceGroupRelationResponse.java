// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
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
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseData data;

    public static UpdateFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserGroupAndDeviceGroupRelationResponse self = new UpdateFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse setData(UpdateFaceUserGroupAndDeviceGroupRelationResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateFaceUserGroupAndDeviceGroupRelationResponseData getData() {
        return this.data;
    }

    public static class UpdateFaceUserGroupAndDeviceGroupRelationResponseData extends TeaModel {
        @NameInMap("ControlId")
        @Validation(required = true)
        public String controlId;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static UpdateFaceUserGroupAndDeviceGroupRelationResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFaceUserGroupAndDeviceGroupRelationResponseData self = new UpdateFaceUserGroupAndDeviceGroupRelationResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateFaceUserGroupAndDeviceGroupRelationResponseData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public UpdateFaceUserGroupAndDeviceGroupRelationResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
