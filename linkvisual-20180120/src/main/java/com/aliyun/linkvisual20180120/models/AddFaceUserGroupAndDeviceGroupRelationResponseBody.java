// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddFaceUserGroupAndDeviceGroupRelationResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static AddFaceUserGroupAndDeviceGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupAndDeviceGroupRelationResponseBody self = new AddFaceUserGroupAndDeviceGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponseBody setData(AddFaceUserGroupAndDeviceGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserGroupAndDeviceGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFaceUserGroupAndDeviceGroupRelationResponseBodyData extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ControlId")
        public String controlId;

        public static AddFaceUserGroupAndDeviceGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserGroupAndDeviceGroupRelationResponseBodyData self = new AddFaceUserGroupAndDeviceGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserGroupAndDeviceGroupRelationResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public AddFaceUserGroupAndDeviceGroupRelationResponseBodyData setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

    }

}
