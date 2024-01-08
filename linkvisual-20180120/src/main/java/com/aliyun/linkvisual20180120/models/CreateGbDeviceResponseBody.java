// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateGbDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateGbDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateGbDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGbDeviceResponseBody self = new CreateGbDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGbDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGbDeviceResponseBody setData(CreateGbDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGbDeviceResponseBodyData getData() {
        return this.data;
    }

    public CreateGbDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateGbDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGbDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGbDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        public static CreateGbDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGbDeviceResponseBodyData self = new CreateGbDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGbDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateGbDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
