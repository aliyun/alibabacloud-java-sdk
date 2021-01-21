// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupResponse extends TeaModel {
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
    public AddFaceDeviceGroupResponseData data;

    public static AddFaceDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupResponse self = new AddFaceDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceDeviceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddFaceDeviceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceDeviceGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceDeviceGroupResponse setData(AddFaceDeviceGroupResponseData data) {
        this.data = data;
        return this;
    }
    public AddFaceDeviceGroupResponseData getData() {
        return this.data;
    }

    public static class AddFaceDeviceGroupResponseData extends TeaModel {
        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("DeviceGroupName")
        @Validation(required = true)
        public String deviceGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static AddFaceDeviceGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceDeviceGroupResponseData self = new AddFaceDeviceGroupResponseData();
            return TeaModel.build(map, self);
        }

        public AddFaceDeviceGroupResponseData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public AddFaceDeviceGroupResponseData setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public AddFaceDeviceGroupResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
