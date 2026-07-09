// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SubmitSlaCouponApplyResponseBody extends TeaModel {
    /**
     * <p>Response structure metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Unique request identifier used to tag a request for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total claimed amount.</p>
     * 
     * <strong>example:</strong>
     * <p>6.4</p>
     */
    @NameInMap("SumCoupon")
    public Double sumCoupon;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>Mon Apr 27 00:00:00 CST 2026</p>
     */
    @NameInMap("ValidEndTime")
    public String validEndTime;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>Tue Oct 27 13:15:58 CST 2026</p>
     */
    @NameInMap("ValidStartTime")
    public String validStartTime;

    public static SubmitSlaCouponApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSlaCouponApplyResponseBody self = new SubmitSlaCouponApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSlaCouponApplyResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public SubmitSlaCouponApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSlaCouponApplyResponseBody setSumCoupon(Double sumCoupon) {
        this.sumCoupon = sumCoupon;
        return this;
    }
    public Double getSumCoupon() {
        return this.sumCoupon;
    }

    public SubmitSlaCouponApplyResponseBody setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
        return this;
    }
    public String getValidEndTime() {
        return this.validEndTime;
    }

    public SubmitSlaCouponApplyResponseBody setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
        return this;
    }
    public String getValidStartTime() {
        return this.validStartTime;
    }

}
