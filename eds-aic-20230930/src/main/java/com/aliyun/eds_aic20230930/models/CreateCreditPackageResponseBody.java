// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCreditPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the credit booster pack.</p>
     * 
     * <strong>example:</strong>
     * <p>crp-bt7e2t4anbq50****</p>
     */
    @NameInMap("CreditPackageId")
    public String creditPackageId;

    @NameInMap("CreditPackageIds")
    public java.util.List<String> creditPackageIds;

    /**
     * <p>The effective period of the credit booster pack.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-30 00:00:00</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The time when the credit booster pack expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-30 00:00:00</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>223684716098****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCreditPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditPackageResponseBody self = new CreateCreditPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCreditPackageResponseBody setCreditPackageId(String creditPackageId) {
        this.creditPackageId = creditPackageId;
        return this;
    }
    public String getCreditPackageId() {
        return this.creditPackageId;
    }

    public CreateCreditPackageResponseBody setCreditPackageIds(java.util.List<String> creditPackageIds) {
        this.creditPackageIds = creditPackageIds;
        return this;
    }
    public java.util.List<String> getCreditPackageIds() {
        return this.creditPackageIds;
    }

    public CreateCreditPackageResponseBody setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateCreditPackageResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public CreateCreditPackageResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCreditPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
