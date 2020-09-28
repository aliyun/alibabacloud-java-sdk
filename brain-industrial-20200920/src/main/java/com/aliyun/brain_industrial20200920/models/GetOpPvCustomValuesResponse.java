// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetOpPvCustomValuesResponse extends TeaModel {
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
    public GetOpPvCustomValuesResponseData data;

    public static GetOpPvCustomValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpPvCustomValuesResponse self = new GetOpPvCustomValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetOpPvCustomValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpPvCustomValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpPvCustomValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpPvCustomValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOpPvCustomValuesResponse setData(GetOpPvCustomValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetOpPvCustomValuesResponseData getData() {
        return this.data;
    }

    public static class GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy extends TeaModel {
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

        public static GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy build(java.util.Map<String, ?> map) throws Exception {
            GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy self = new GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy();
            return TeaModel.build(map, self);
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy extends TeaModel {
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

        public static GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy build(java.util.Map<String, ?> map) throws Exception {
            GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy self = new GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy();
            return TeaModel.build(map, self);
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetOpPvCustomValuesResponseDataOppvCustomDataInfo extends TeaModel {
        @NameInMap("Opzdy")
        @Validation(required = true)
        public java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy> opzdy;

        @NameInMap("Pvzdy")
        @Validation(required = true)
        public java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy> pvzdy;

        public static GetOpPvCustomValuesResponseDataOppvCustomDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOpPvCustomValuesResponseDataOppvCustomDataInfo self = new GetOpPvCustomValuesResponseDataOppvCustomDataInfo();
            return TeaModel.build(map, self);
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfo setOpzdy(java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy> opzdy) {
            this.opzdy = opzdy;
            return this;
        }
        public java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoOpzdy> getOpzdy() {
            return this.opzdy;
        }

        public GetOpPvCustomValuesResponseDataOppvCustomDataInfo setPvzdy(java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy> pvzdy) {
            this.pvzdy = pvzdy;
            return this;
        }
        public java.util.List<GetOpPvCustomValuesResponseDataOppvCustomDataInfoPvzdy> getPvzdy() {
            return this.pvzdy;
        }

    }

    public static class GetOpPvCustomValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("OppvCustomDataInfo")
        @Validation(required = true)
        public GetOpPvCustomValuesResponseDataOppvCustomDataInfo oppvCustomDataInfo;

        public static GetOpPvCustomValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetOpPvCustomValuesResponseData self = new GetOpPvCustomValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetOpPvCustomValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetOpPvCustomValuesResponseData setOppvCustomDataInfo(GetOpPvCustomValuesResponseDataOppvCustomDataInfo oppvCustomDataInfo) {
            this.oppvCustomDataInfo = oppvCustomDataInfo;
            return this;
        }
        public GetOpPvCustomValuesResponseDataOppvCustomDataInfo getOppvCustomDataInfo() {
            return this.oppvCustomDataInfo;
        }

    }

}
