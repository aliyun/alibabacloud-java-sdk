// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateCountDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CouponTemplateCountList")
    public java.util.List<QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList> couponTemplateCountList;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCouponTemplateCountDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateCountDetailResponseBody self = new QueryCouponTemplateCountDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateCountDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCouponTemplateCountDetailResponseBody setCouponTemplateCountList(java.util.List<QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList> couponTemplateCountList) {
        this.couponTemplateCountList = couponTemplateCountList;
        return this;
    }
    public java.util.List<QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList> getCouponTemplateCountList() {
        return this.couponTemplateCountList;
    }

    public QueryCouponTemplateCountDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryCouponTemplateCountDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryCouponTemplateCountDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryCouponTemplateCountDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCouponTemplateCountDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCouponTemplateCountDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCouponTemplateCountDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList extends TeaModel {
        @NameInMap("ApplyCount")
        public Long applyCount;

        @NameInMap("SurplusCount")
        public Long surplusCount;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseCount")
        public Long useCount;

        public static QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList build(java.util.Map<String, ?> map) throws Exception {
            QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList self = new QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList();
            return TeaModel.build(map, self);
        }

        public QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList setApplyCount(Long applyCount) {
            this.applyCount = applyCount;
            return this;
        }
        public Long getApplyCount() {
            return this.applyCount;
        }

        public QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList setSurplusCount(Long surplusCount) {
            this.surplusCount = surplusCount;
            return this;
        }
        public Long getSurplusCount() {
            return this.surplusCount;
        }

        public QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCouponTemplateCountDetailResponseBodyCouponTemplateCountList setUseCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }
        public Long getUseCount() {
            return this.useCount;
        }

    }

}
