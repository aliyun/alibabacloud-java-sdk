// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddFaceDeviceGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static AddFaceDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupResponseBody self = new AddFaceDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceDeviceGroupResponseBody setData(AddFaceDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public AddFaceDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFaceDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        public static AddFaceDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceDeviceGroupResponseBodyData self = new AddFaceDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceDeviceGroupResponseBodyData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public AddFaceDeviceGroupResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public AddFaceDeviceGroupResponseBodyData setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

    }

}
