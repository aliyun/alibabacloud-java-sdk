// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPvIdentSimulationValuesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetPvIdentSimulationValuesResponseData data;

    public static GetPvIdentSimulationValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPvIdentSimulationValuesResponse self = new GetPvIdentSimulationValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetPvIdentSimulationValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPvIdentSimulationValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPvIdentSimulationValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPvIdentSimulationValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPvIdentSimulationValuesResponse setData(GetPvIdentSimulationValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetPvIdentSimulationValuesResponseData getData() {
        return this.data;
    }

    public static class GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv extends TeaModel {
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

        public static GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv build(java.util.Map<String, ?> map) throws Exception {
            GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv self = new GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv();
            return TeaModel.build(map, self);
        }

        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo extends TeaModel {
        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv> pv;

        public static GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo self = new GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo();
            return TeaModel.build(map, self);
        }

        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo setPv(java.util.List<GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfoPv> getPv() {
            return this.pv;
        }

    }

    public static class GetPvIdentSimulationValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("PvIdentSimulateDataInfo")
        @Validation(required = true)
        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo pvIdentSimulateDataInfo;

        public static GetPvIdentSimulationValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPvIdentSimulationValuesResponseData self = new GetPvIdentSimulationValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetPvIdentSimulationValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetPvIdentSimulationValuesResponseData setPvIdentSimulateDataInfo(GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo pvIdentSimulateDataInfo) {
            this.pvIdentSimulateDataInfo = pvIdentSimulateDataInfo;
            return this;
        }
        public GetPvIdentSimulationValuesResponseDataPvIdentSimulateDataInfo getPvIdentSimulateDataInfo() {
            return this.pvIdentSimulateDataInfo;
        }

    }

}
