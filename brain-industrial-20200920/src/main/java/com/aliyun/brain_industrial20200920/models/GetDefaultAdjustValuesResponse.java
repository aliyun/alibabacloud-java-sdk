// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDefaultAdjustValuesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDefaultAdjustValuesResponseData data;

    public static GetDefaultAdjustValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAdjustValuesResponse self = new GetDefaultAdjustValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultAdjustValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultAdjustValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDefaultAdjustValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDefaultAdjustValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDefaultAdjustValuesResponse setData(GetDefaultAdjustValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetDefaultAdjustValuesResponseData getData() {
        return this.data;
    }

    public static class GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl extends TeaModel {
        @NameInMap("Kp")
        @Validation(required = true)
        public Float kp;

        @NameInMap("Ti")
        @Validation(required = true)
        public Float ti;

        @NameInMap("Td")
        @Validation(required = true)
        public Float td;

        public static GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl self = new GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl();
            return TeaModel.build(map, self);
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl setKp(Float kp) {
            this.kp = kp;
            return this;
        }
        public Float getKp() {
            return this.kp;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl setTi(Float ti) {
            this.ti = ti;
            return this;
        }
        public Float getTi() {
            return this.ti;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl setTd(Float td) {
            this.td = td;
            return this;
        }
        public Float getTd() {
            return this.td;
        }

    }

    public static class GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform extends TeaModel {
        @NameInMap("RaiseTime")
        @Validation(required = true)
        public Float raiseTime;

        @NameInMap("FinalValue")
        @Validation(required = true)
        public Float finalValue;

        @NameInMap("OverValue")
        @Validation(required = true)
        public Float overValue;

        @NameInMap("StableError")
        @Validation(required = true)
        public Float stableError;

        @NameInMap("AdjustTime")
        @Validation(required = true)
        public Float adjustTime;

        @NameInMap("Dynamic")
        @Validation(required = true)
        public Float dynamic;

        @NameInMap("Robust")
        @Validation(required = true)
        public Float robust;

        public static GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform self = new GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform();
            return TeaModel.build(map, self);
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setRaiseTime(Float raiseTime) {
            this.raiseTime = raiseTime;
            return this;
        }
        public Float getRaiseTime() {
            return this.raiseTime;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setFinalValue(Float finalValue) {
            this.finalValue = finalValue;
            return this;
        }
        public Float getFinalValue() {
            return this.finalValue;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setOverValue(Float overValue) {
            this.overValue = overValue;
            return this;
        }
        public Float getOverValue() {
            return this.overValue;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setStableError(Float stableError) {
            this.stableError = stableError;
            return this;
        }
        public Float getStableError() {
            return this.stableError;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setAdjustTime(Float adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public Float getAdjustTime() {
            return this.adjustTime;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setDynamic(Float dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Float getDynamic() {
            return this.dynamic;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform setRobust(Float robust) {
            this.robust = robust;
            return this;
        }
        public Float getRobust() {
            return this.robust;
        }

    }

    public static class GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform extends TeaModel {
        @NameInMap("RaiseTime")
        @Validation(required = true)
        public Float raiseTime;

        @NameInMap("FinalValue")
        @Validation(required = true)
        public Float finalValue;

        @NameInMap("OverValue")
        @Validation(required = true)
        public Float overValue;

        @NameInMap("StableError")
        @Validation(required = true)
        public Float stableError;

        @NameInMap("AdjustTime")
        @Validation(required = true)
        public Float adjustTime;

        @NameInMap("Dynamic")
        @Validation(required = true)
        public Float dynamic;

        @NameInMap("Robust")
        @Validation(required = true)
        public Float robust;

        public static GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform self = new GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform();
            return TeaModel.build(map, self);
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setRaiseTime(Float raiseTime) {
            this.raiseTime = raiseTime;
            return this;
        }
        public Float getRaiseTime() {
            return this.raiseTime;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setFinalValue(Float finalValue) {
            this.finalValue = finalValue;
            return this;
        }
        public Float getFinalValue() {
            return this.finalValue;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setOverValue(Float overValue) {
            this.overValue = overValue;
            return this;
        }
        public Float getOverValue() {
            return this.overValue;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setStableError(Float stableError) {
            this.stableError = stableError;
            return this;
        }
        public Float getStableError() {
            return this.stableError;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setAdjustTime(Float adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public Float getAdjustTime() {
            return this.adjustTime;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setDynamic(Float dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Float getDynamic() {
            return this.dynamic;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform setRobust(Float robust) {
            this.robust = robust;
            return this;
        }
        public Float getRobust() {
            return this.robust;
        }

    }

    public static class GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo extends TeaModel {
        @NameInMap("ManualCtrl")
        @Validation(required = true)
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl manualCtrl;

        @NameInMap("Perform")
        @Validation(required = true)
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform perform;

        @NameInMap("ManualPerform")
        @Validation(required = true)
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform manualPerform;

        public static GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo self = new GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo();
            return TeaModel.build(map, self);
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo setManualCtrl(GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl manualCtrl) {
            this.manualCtrl = manualCtrl;
            return this;
        }
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualCtrl getManualCtrl() {
            return this.manualCtrl;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo setPerform(GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform perform) {
            this.perform = perform;
            return this;
        }
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoPerform getPerform() {
            return this.perform;
        }

        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo setManualPerform(GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform manualPerform) {
            this.manualPerform = manualPerform;
            return this;
        }
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfoManualPerform getManualPerform() {
            return this.manualPerform;
        }

    }

    public static class GetDefaultAdjustValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("DefaultAdjustDataInfo")
        @Validation(required = true)
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo defaultAdjustDataInfo;

        public static GetDefaultAdjustValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAdjustValuesResponseData self = new GetDefaultAdjustValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetDefaultAdjustValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDefaultAdjustValuesResponseData setDefaultAdjustDataInfo(GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo defaultAdjustDataInfo) {
            this.defaultAdjustDataInfo = defaultAdjustDataInfo;
            return this;
        }
        public GetDefaultAdjustValuesResponseDataDefaultAdjustDataInfo getDefaultAdjustDataInfo() {
            return this.defaultAdjustDataInfo;
        }

    }

}
