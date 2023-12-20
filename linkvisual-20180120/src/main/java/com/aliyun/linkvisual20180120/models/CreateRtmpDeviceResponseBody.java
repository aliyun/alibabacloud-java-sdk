// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRtmpDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateRtmpDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRtmpDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRtmpDeviceResponseBody self = new CreateRtmpDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRtmpDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRtmpDeviceResponseBody setData(CreateRtmpDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRtmpDeviceResponseBodyData getData() {
        return this.data;
    }

    public CreateRtmpDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRtmpDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRtmpDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRtmpDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("StreamName")
        public String streamName;

        public static CreateRtmpDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRtmpDeviceResponseBodyData self = new CreateRtmpDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRtmpDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateRtmpDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public CreateRtmpDeviceResponseBodyData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
