// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetIpcDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetIpcDetailResponseBodyData data;

    public static GetIpcDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDetailResponseBody self = new GetIpcDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpcDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetIpcDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIpcDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpcDetailResponseBody setData(GetIpcDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIpcDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetIpcDetailResponseBodyDataAbilityConfigDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("AbilityType")
        public String abilityType;

        @NameInMap("AbilityName")
        public String abilityName;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        public static GetIpcDetailResponseBodyDataAbilityConfigDetail build(java.util.Map<String, ?> map) throws Exception {
            GetIpcDetailResponseBodyDataAbilityConfigDetail self = new GetIpcDetailResponseBodyDataAbilityConfigDetail();
            return TeaModel.build(map, self);
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setAbilityType(String abilityType) {
            this.abilityType = abilityType;
            return this;
        }
        public String getAbilityType() {
            return this.abilityType;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setAbilityName(String abilityName) {
            this.abilityName = abilityName;
            return this;
        }
        public String getAbilityName() {
            return this.abilityName;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetIpcDetailResponseBodyDataAbilityConfigDetail setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

    }

    public static class GetIpcDetailResponseBodyData extends TeaModel {
        @NameInMap("AbilityConfigDetail")
        public java.util.List<GetIpcDetailResponseBodyDataAbilityConfigDetail> abilityConfigDetail;

        public static GetIpcDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIpcDetailResponseBodyData self = new GetIpcDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIpcDetailResponseBodyData setAbilityConfigDetail(java.util.List<GetIpcDetailResponseBodyDataAbilityConfigDetail> abilityConfigDetail) {
            this.abilityConfigDetail = abilityConfigDetail;
            return this;
        }
        public java.util.List<GetIpcDetailResponseBodyDataAbilityConfigDetail> getAbilityConfigDetail() {
            return this.abilityConfigDetail;
        }

    }

}
