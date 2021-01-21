// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupAndDeviceGroupRelationResponse extends TeaModel {
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
    public AddFaceUserGroupAndDeviceGroupRelationResponseData data;

    public static AddFaceUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupAndDeviceGroupRelationResponse self = new AddFaceUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse setData(AddFaceUserGroupAndDeviceGroupRelationResponseData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserGroupAndDeviceGroupRelationResponseData getData() {
        return this.data;
    }

    public static class AddFaceUserGroupAndDeviceGroupRelationResponseData extends TeaModel {
        @NameInMap("ControlId")
        @Validation(required = true)
        public String controlId;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static AddFaceUserGroupAndDeviceGroupRelationResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserGroupAndDeviceGroupRelationResponseData self = new AddFaceUserGroupAndDeviceGroupRelationResponseData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserGroupAndDeviceGroupRelationResponseData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public AddFaceUserGroupAndDeviceGroupRelationResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
