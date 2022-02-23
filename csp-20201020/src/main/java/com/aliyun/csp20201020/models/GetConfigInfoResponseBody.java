// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class GetConfigInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetConfigInfoResponseBodyData data;

    @NameInMap("ErrCode")
    public Integer errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetConfigInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigInfoResponseBody self = new GetConfigInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigInfoResponseBody setData(GetConfigInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConfigInfoResponseBodyData getData() {
        return this.data;
    }

    public GetConfigInfoResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public GetConfigInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetConfigInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConfigInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConfigInfoResponseBodyDataPricingInfos extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        public static GetConfigInfoResponseBodyDataPricingInfos build(java.util.Map<String, ?> map) throws Exception {
            GetConfigInfoResponseBodyDataPricingInfos self = new GetConfigInfoResponseBodyDataPricingInfos();
            return TeaModel.build(map, self);
        }

        public GetConfigInfoResponseBodyDataPricingInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetConfigInfoResponseBodyDataPricingInfos setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

    public static class GetConfigInfoResponseBodyData extends TeaModel {
        @NameInMap("PricingInfos")
        public java.util.List<GetConfigInfoResponseBodyDataPricingInfos> pricingInfos;

        @NameInMap("SpecVersionInfoMap")
        public java.util.Map<String, DataSpecVersionInfoMapValue> specVersionInfoMap;

        public static GetConfigInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConfigInfoResponseBodyData self = new GetConfigInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConfigInfoResponseBodyData setPricingInfos(java.util.List<GetConfigInfoResponseBodyDataPricingInfos> pricingInfos) {
            this.pricingInfos = pricingInfos;
            return this;
        }
        public java.util.List<GetConfigInfoResponseBodyDataPricingInfos> getPricingInfos() {
            return this.pricingInfos;
        }

        public GetConfigInfoResponseBodyData setSpecVersionInfoMap(java.util.Map<String, DataSpecVersionInfoMapValue> specVersionInfoMap) {
            this.specVersionInfoMap = specVersionInfoMap;
            return this;
        }
        public java.util.Map<String, DataSpecVersionInfoMapValue> getSpecVersionInfoMap() {
            return this.specVersionInfoMap;
        }

    }

}
