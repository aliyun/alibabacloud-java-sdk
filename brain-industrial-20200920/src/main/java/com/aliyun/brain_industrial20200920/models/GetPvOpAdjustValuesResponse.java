// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPvOpAdjustValuesResponse extends TeaModel {
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
    public GetPvOpAdjustValuesResponseData data;

    public static GetPvOpAdjustValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPvOpAdjustValuesResponse self = new GetPvOpAdjustValuesResponse();
        return TeaModel.build(map, self);
    }

    public GetPvOpAdjustValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPvOpAdjustValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPvOpAdjustValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPvOpAdjustValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPvOpAdjustValuesResponse setData(GetPvOpAdjustValuesResponseData data) {
        this.data = data;
        return this;
    }
    public GetPvOpAdjustValuesResponseData getData() {
        return this.data;
    }

    public static class GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp extends TeaModel {
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

        public static GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp build(java.util.Map<String, ?> map) throws Exception {
            GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp self = new GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp();
            return TeaModel.build(map, self);
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv extends TeaModel {
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

        public static GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv build(java.util.Map<String, ?> map) throws Exception {
            GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv self = new GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv();
            return TeaModel.build(map, self);
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp extends TeaModel {
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

        public static GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp build(java.util.Map<String, ?> map) throws Exception {
            GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp self = new GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp();
            return TeaModel.build(map, self);
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

    }

    public static class GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo extends TeaModel {
        @NameInMap("Op")
        @Validation(required = true)
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp> op;

        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv> pv;

        @NameInMap("Sp")
        @Validation(required = true)
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp> sp;

        public static GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo self = new GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo();
            return TeaModel.build(map, self);
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo setOp(java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp> op) {
            this.op = op;
            return this;
        }
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoOp> getOp() {
            return this.op;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo setPv(java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoPv> getPv() {
            return this.pv;
        }

        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo setSp(java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp> sp) {
            this.sp = sp;
            return this;
        }
        public java.util.List<GetPvOpAdjustValuesResponseDataPvopAdjustDataInfoSp> getSp() {
            return this.sp;
        }

    }

    public static class GetPvOpAdjustValuesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("PvopAdjustDataInfo")
        @Validation(required = true)
        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo pvopAdjustDataInfo;

        public static GetPvOpAdjustValuesResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPvOpAdjustValuesResponseData self = new GetPvOpAdjustValuesResponseData();
            return TeaModel.build(map, self);
        }

        public GetPvOpAdjustValuesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetPvOpAdjustValuesResponseData setPvopAdjustDataInfo(GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo pvopAdjustDataInfo) {
            this.pvopAdjustDataInfo = pvopAdjustDataInfo;
            return this;
        }
        public GetPvOpAdjustValuesResponseDataPvopAdjustDataInfo getPvopAdjustDataInfo() {
            return this.pvopAdjustDataInfo;
        }

    }

}
