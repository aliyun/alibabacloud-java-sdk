// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAlipayActivityDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CouponTemplates")
    public java.util.List<ListAlipayActivityDetailResponseBodyCouponTemplates> couponTemplates;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAlipayActivityDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlipayActivityDetailResponseBody self = new ListAlipayActivityDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlipayActivityDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlipayActivityDetailResponseBody setCouponTemplates(java.util.List<ListAlipayActivityDetailResponseBodyCouponTemplates> couponTemplates) {
        this.couponTemplates = couponTemplates;
        return this;
    }
    public java.util.List<ListAlipayActivityDetailResponseBodyCouponTemplates> getCouponTemplates() {
        return this.couponTemplates;
    }

    public ListAlipayActivityDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlipayActivityDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlipayActivityDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlipayActivityDetailResponseBodyCouponTemplates extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("EffectiveInfo")
        public String effectiveInfo;

        public static ListAlipayActivityDetailResponseBodyCouponTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListAlipayActivityDetailResponseBodyCouponTemplates self = new ListAlipayActivityDetailResponseBodyCouponTemplates();
            return TeaModel.build(map, self);
        }

        public ListAlipayActivityDetailResponseBodyCouponTemplates setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ListAlipayActivityDetailResponseBodyCouponTemplates setEffectiveInfo(String effectiveInfo) {
            this.effectiveInfo = effectiveInfo;
            return this;
        }
        public String getEffectiveInfo() {
            return this.effectiveInfo;
        }

    }

}
