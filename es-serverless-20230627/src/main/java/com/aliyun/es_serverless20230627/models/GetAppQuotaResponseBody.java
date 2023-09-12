// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetAppQuotaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetAppQuotaResponseBodyResult result;

    public static GetAppQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppQuotaResponseBody self = new GetAppQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppQuotaResponseBody setResult(GetAppQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppQuotaResponseBodyResultLimiterInfoLimiters extends TeaModel {
        @NameInMap("immutable")
        public Boolean immutable;

        @NameInMap("maxValue")
        public Long maxValue;

        @NameInMap("minValue")
        public Long minValue;

        @NameInMap("type")
        public String type;

        public static GetAppQuotaResponseBodyResultLimiterInfoLimiters build(java.util.Map<String, ?> map) throws Exception {
            GetAppQuotaResponseBodyResultLimiterInfoLimiters self = new GetAppQuotaResponseBodyResultLimiterInfoLimiters();
            return TeaModel.build(map, self);
        }

        public GetAppQuotaResponseBodyResultLimiterInfoLimiters setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public GetAppQuotaResponseBodyResultLimiterInfoLimiters setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public GetAppQuotaResponseBodyResultLimiterInfoLimiters setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public GetAppQuotaResponseBodyResultLimiterInfoLimiters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAppQuotaResponseBodyResultLimiterInfo extends TeaModel {
        @NameInMap("limiters")
        public java.util.List<GetAppQuotaResponseBodyResultLimiterInfoLimiters> limiters;

        public static GetAppQuotaResponseBodyResultLimiterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAppQuotaResponseBodyResultLimiterInfo self = new GetAppQuotaResponseBodyResultLimiterInfo();
            return TeaModel.build(map, self);
        }

        public GetAppQuotaResponseBodyResultLimiterInfo setLimiters(java.util.List<GetAppQuotaResponseBodyResultLimiterInfoLimiters> limiters) {
            this.limiters = limiters;
            return this;
        }
        public java.util.List<GetAppQuotaResponseBodyResultLimiterInfoLimiters> getLimiters() {
            return this.limiters;
        }

    }

    public static class GetAppQuotaResponseBodyResult extends TeaModel {
        @NameInMap("limiterInfo")
        public GetAppQuotaResponseBodyResultLimiterInfo limiterInfo;

        @NameInMap("quotaInfo")
        public java.util.Map<String, ?> quotaInfo;

        public static GetAppQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppQuotaResponseBodyResult self = new GetAppQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppQuotaResponseBodyResult setLimiterInfo(GetAppQuotaResponseBodyResultLimiterInfo limiterInfo) {
            this.limiterInfo = limiterInfo;
            return this;
        }
        public GetAppQuotaResponseBodyResultLimiterInfo getLimiterInfo() {
            return this.limiterInfo;
        }

        public GetAppQuotaResponseBodyResult setQuotaInfo(java.util.Map<String, ?> quotaInfo) {
            this.quotaInfo = quotaInfo;
            return this;
        }
        public java.util.Map<String, ?> getQuotaInfo() {
            return this.quotaInfo;
        }

    }

}
