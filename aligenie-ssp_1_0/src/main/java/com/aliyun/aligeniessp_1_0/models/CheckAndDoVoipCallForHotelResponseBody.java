// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAndDoVoipCallForHotelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckAndDoVoipCallForHotelResponseBodyResult result;

    public static CheckAndDoVoipCallForHotelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAndDoVoipCallForHotelResponseBody self = new CheckAndDoVoipCallForHotelResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAndDoVoipCallForHotelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CheckAndDoVoipCallForHotelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAndDoVoipCallForHotelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAndDoVoipCallForHotelResponseBody setResult(CheckAndDoVoipCallForHotelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckAndDoVoipCallForHotelResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData extends TeaModel {
        @NameInMap("DeviceIcon")
        public String deviceIcon;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Uuid")
        public String uuid;

        public static CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData self = new CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData setDeviceIcon(String deviceIcon) {
            this.deviceIcon = deviceIcon;
            return this;
        }
        public String getDeviceIcon() {
            return this.deviceIcon;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Data")
        public java.util.List<CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData> data;

        @NameInMap("Msg")
        public String msg;

        public static CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets self = new CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets setData(java.util.List<CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargetsData> getData() {
            return this.data;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

    public static class CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("RetCode")
        public Integer retCode;

        @NameInMap("RetValue")
        public String retValue;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TraceId")
        public String traceId;

        public static CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult self = new CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult setRetCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }
        public Integer getRetCode() {
            return this.retCode;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult setRetValue(String retValue) {
            this.retValue = retValue;
            return this;
        }
        public String getRetValue() {
            return this.retValue;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class CheckAndDoVoipCallForHotelResponseBodyResult extends TeaModel {
        @NameInMap("DeviceTargets")
        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets deviceTargets;

        @NameInMap("IsStartCall")
        public Boolean isStartCall;

        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("StartCallResult")
        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult startCallResult;

        public static CheckAndDoVoipCallForHotelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelResponseBodyResult self = new CheckAndDoVoipCallForHotelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelResponseBodyResult setDeviceTargets(CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets deviceTargets) {
            this.deviceTargets = deviceTargets;
            return this;
        }
        public CheckAndDoVoipCallForHotelResponseBodyResultDeviceTargets getDeviceTargets() {
            return this.deviceTargets;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResult setIsStartCall(Boolean isStartCall) {
            this.isStartCall = isStartCall;
            return this;
        }
        public Boolean getIsStartCall() {
            return this.isStartCall;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public CheckAndDoVoipCallForHotelResponseBodyResult setStartCallResult(CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult startCallResult) {
            this.startCallResult = startCallResult;
            return this;
        }
        public CheckAndDoVoipCallForHotelResponseBodyResultStartCallResult getStartCallResult() {
            return this.startCallResult;
        }

    }

}
