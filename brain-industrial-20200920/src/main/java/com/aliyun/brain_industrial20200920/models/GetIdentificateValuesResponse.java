// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetIdentificateValuesResponse extends TeaModel {
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
    public GetIdentificateValuesResponseData data;

    public static GetIdentificateValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificateValuesResponse self = new GetIdentificateValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentificateValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentificateValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentificateValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentificateValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetIdentificateValuesResponse setData(GetIdentificateValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetIdentificateValuesResponseData getData() {
        return this.data;
    }

    public static class GetIdentificateValuesResponseDataIdentificateDataInfoDj extends TeaModel {
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

        public static GetIdentificateValuesResponseDataIdentificateDataInfoDj build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificateValuesResponseDataIdentificateDataInfoDj self = new GetIdentificateValuesResponseDataIdentificateDataInfoDj();
            return TeaModel.build(map, self);
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoDj setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoDj setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoDj setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoDj setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetIdentificateValuesResponseDataIdentificateDataInfoGj extends TeaModel {
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

        public static GetIdentificateValuesResponseDataIdentificateDataInfoGj build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificateValuesResponseDataIdentificateDataInfoGj self = new GetIdentificateValuesResponseDataIdentificateDataInfoGj();
            return TeaModel.build(map, self);
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoGj setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoGj setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoGj setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoGj setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetIdentificateValuesResponseDataIdentificateDataInfoBs extends TeaModel {
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

        public static GetIdentificateValuesResponseDataIdentificateDataInfoBs build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificateValuesResponseDataIdentificateDataInfoBs self = new GetIdentificateValuesResponseDataIdentificateDataInfoBs();
            return TeaModel.build(map, self);
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoBs setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoBs setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoBs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfoBs setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetIdentificateValuesResponseDataIdentificateDataInfo extends TeaModel {
        @NameInMap("Dj")
        @Validation(required = true)
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoDj> dj;

        @NameInMap("Gj")
        @Validation(required = true)
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoGj> gj;

        @NameInMap("Bs")
        @Validation(required = true)
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoBs> bs;

        public static GetIdentificateValuesResponseDataIdentificateDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificateValuesResponseDataIdentificateDataInfo self = new GetIdentificateValuesResponseDataIdentificateDataInfo();
            return TeaModel.build(map, self);
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfo setDj(java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoDj> dj) {
            this.dj = dj;
            return this;
        }
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoDj> getDj() {
            return this.dj;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfo setGj(java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoGj> gj) {
            this.gj = gj;
            return this;
        }
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoGj> getGj() {
            return this.gj;
        }

        public GetIdentificateValuesResponseDataIdentificateDataInfo setBs(java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoBs> bs) {
            this.bs = bs;
            return this;
        }
        public java.util.List<GetIdentificateValuesResponseDataIdentificateDataInfoBs> getBs() {
            return this.bs;
        }

    }

    public static class GetIdentificateValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("IdentificateDataInfo")
        @Validation(required = true)
        public GetIdentificateValuesResponseDataIdentificateDataInfo identificateDataInfo;

        public static GetIdentificateValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificateValuesResponseData self = new GetIdentificateValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetIdentificateValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetIdentificateValuesResponseData setIdentificateDataInfo(GetIdentificateValuesResponseDataIdentificateDataInfo identificateDataInfo) {
            this.identificateDataInfo = identificateDataInfo;
            return this;
        }
        public GetIdentificateValuesResponseDataIdentificateDataInfo getIdentificateDataInfo() {
            return this.identificateDataInfo;
        }

    }

}
