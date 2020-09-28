// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetCustomIdentValuesResponse extends TeaModel {
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
    public GetCustomIdentValuesResponseData data;

    public static GetCustomIdentValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomIdentValuesResponse self = new GetCustomIdentValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomIdentValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomIdentValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomIdentValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomIdentValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomIdentValuesResponse setData(GetCustomIdentValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetCustomIdentValuesResponseData getData() {
        return this.data;
    }

    public static class GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend extends TeaModel {
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

        public static GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend build(java.util.Map<String, ?> map) throws Exception {
            GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend self = new GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend();
            return TeaModel.build(map, self);
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual extends TeaModel {
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

        public static GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual build(java.util.Map<String, ?> map) throws Exception {
            GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual self = new GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual();
            return TeaModel.build(map, self);
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetCustomIdentValuesResponseDataCustomIdentDataInfo extends TeaModel {
        @NameInMap("CustomModelTrend")
        @Validation(required = true)
        public java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend> customModelTrend;

        @NameInMap("CustomResidual")
        @Validation(required = true)
        public java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual> customResidual;

        public static GetCustomIdentValuesResponseDataCustomIdentDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomIdentValuesResponseDataCustomIdentDataInfo self = new GetCustomIdentValuesResponseDataCustomIdentDataInfo();
            return TeaModel.build(map, self);
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfo setCustomModelTrend(java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend> customModelTrend) {
            this.customModelTrend = customModelTrend;
            return this;
        }
        public java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomModelTrend> getCustomModelTrend() {
            return this.customModelTrend;
        }

        public GetCustomIdentValuesResponseDataCustomIdentDataInfo setCustomResidual(java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual> customResidual) {
            this.customResidual = customResidual;
            return this;
        }
        public java.util.List<GetCustomIdentValuesResponseDataCustomIdentDataInfoCustomResidual> getCustomResidual() {
            return this.customResidual;
        }

    }

    public static class GetCustomIdentValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("CustomIdentDataInfo")
        @Validation(required = true)
        public GetCustomIdentValuesResponseDataCustomIdentDataInfo customIdentDataInfo;

        public static GetCustomIdentValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomIdentValuesResponseData self = new GetCustomIdentValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetCustomIdentValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetCustomIdentValuesResponseData setCustomIdentDataInfo(GetCustomIdentValuesResponseDataCustomIdentDataInfo customIdentDataInfo) {
            this.customIdentDataInfo = customIdentDataInfo;
            return this;
        }
        public GetCustomIdentValuesResponseDataCustomIdentDataInfo getCustomIdentDataInfo() {
            return this.customIdentDataInfo;
        }

    }

}
