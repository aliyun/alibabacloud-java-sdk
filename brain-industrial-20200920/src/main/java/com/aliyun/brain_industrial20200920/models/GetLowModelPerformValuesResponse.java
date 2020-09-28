// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLowModelPerformValuesResponse extends TeaModel {
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
    public java.util.Map<String, ?> success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetLowModelPerformValuesResponseData data;

    public static GetLowModelPerformValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLowModelPerformValuesResponse self = new GetLowModelPerformValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetLowModelPerformValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLowModelPerformValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLowModelPerformValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLowModelPerformValuesResponse setSuccess(java.util.Map<String, ?> success) {
        this.success = success;
        return this;
    }
    public java.util.Map<String, ?> getSuccess() {
        return this.success;
    }

    public GetLowModelPerformValuesResponse setData(GetLowModelPerformValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetLowModelPerformValuesResponseData getData() {
        return this.data;
    }

    public static class GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel extends TeaModel {
        @NameInMap("K")
        @Validation(required = true)
        public Float k;

        @NameInMap("Tau")
        @Validation(required = true)
        public Float tau;

        @NameInMap("T1")
        @Validation(required = true)
        public Float t1;

        @NameInMap("T2")
        @Validation(required = true)
        public Float t2;

        public static GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel build(java.util.Map<String, ?> map) throws Exception {
            GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel self = new GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel();
            return TeaModel.build(map, self);
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel setK(Float k) {
            this.k = k;
            return this;
        }
        public Float getK() {
            return this.k;
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel setTau(Float tau) {
            this.tau = tau;
            return this;
        }
        public Float getTau() {
            return this.tau;
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel setT1(Float t1) {
            this.t1 = t1;
            return this;
        }
        public Float getT1() {
            return this.t1;
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel setT2(Float t2) {
            this.t2 = t2;
            return this;
        }
        public Float getT2() {
            return this.t2;
        }

    }

    public static class GetLowModelPerformValuesResponseDataLowModelPerformDataInfo extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("FitDegree")
        @Validation(required = true)
        public Float fitDegree;

        @NameInMap("ManualModel")
        @Validation(required = true)
        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel manualModel;

        public static GetLowModelPerformValuesResponseDataLowModelPerformDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLowModelPerformValuesResponseDataLowModelPerformDataInfo self = new GetLowModelPerformValuesResponseDataLowModelPerformDataInfo();
            return TeaModel.build(map, self);
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfo setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfo setFitDegree(Float fitDegree) {
            this.fitDegree = fitDegree;
            return this;
        }
        public Float getFitDegree() {
            return this.fitDegree;
        }

        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfo setManualModel(GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel manualModel) {
            this.manualModel = manualModel;
            return this;
        }
        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfoManualModel getManualModel() {
            return this.manualModel;
        }

    }

    public static class GetLowModelPerformValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("LowModelPerformDataInfo")
        @Validation(required = true)
        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfo lowModelPerformDataInfo;

        public static GetLowModelPerformValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetLowModelPerformValuesResponseData self = new GetLowModelPerformValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetLowModelPerformValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetLowModelPerformValuesResponseData setLowModelPerformDataInfo(GetLowModelPerformValuesResponseDataLowModelPerformDataInfo lowModelPerformDataInfo) {
            this.lowModelPerformDataInfo = lowModelPerformDataInfo;
            return this;
        }
        public GetLowModelPerformValuesResponseDataLowModelPerformDataInfo getLowModelPerformDataInfo() {
            return this.lowModelPerformDataInfo;
        }

    }

}
