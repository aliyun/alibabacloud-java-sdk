// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPvCustomSimulationValuesResponse extends TeaModel {
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
    public GetPvCustomSimulationValuesResponseData data;

    public static GetPvCustomSimulationValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPvCustomSimulationValuesResponse self = new GetPvCustomSimulationValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetPvCustomSimulationValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPvCustomSimulationValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPvCustomSimulationValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPvCustomSimulationValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPvCustomSimulationValuesResponse setData(GetPvCustomSimulationValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetPvCustomSimulationValuesResponseData getData() {
        return this.data;
    }

    public static class GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Quality")
        @Validation(required = true)
        public Integer quality;

        public static GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv build(java.util.Map<String, ?> map) throws Exception {
            GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv self = new GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv();
            return TeaModel.build(map, self);
        }

        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo extends TeaModel {
        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv> pv;

        public static GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo self = new GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo();
            return TeaModel.build(map, self);
        }

        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo setPv(java.util.List<GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfoPv> getPv() {
            return this.pv;
        }

    }

    public static class GetPvCustomSimulationValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("PvCustomSimulateDataInfo")
        @Validation(required = true)
        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo pvCustomSimulateDataInfo;

        public static GetPvCustomSimulationValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPvCustomSimulationValuesResponseData self = new GetPvCustomSimulationValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetPvCustomSimulationValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetPvCustomSimulationValuesResponseData setPvCustomSimulateDataInfo(GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo pvCustomSimulateDataInfo) {
            this.pvCustomSimulateDataInfo = pvCustomSimulateDataInfo;
            return this;
        }
        public GetPvCustomSimulationValuesResponseDataPvCustomSimulateDataInfo getPvCustomSimulateDataInfo() {
            return this.pvCustomSimulateDataInfo;
        }

    }

}
