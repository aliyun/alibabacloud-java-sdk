// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CancelCouponRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>501001340370350</p>
     */
    @NameInMap("CouponId")
    public Long couponId;

    public static CancelCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCouponRequest self = new CancelCouponRequest();
        return TeaModel.build(map, self);
    }

    public CancelCouponRequest setCouponId(Long couponId) {
        this.couponId = couponId;
        return this;
    }
    public Long getCouponId() {
        return this.couponId;
    }

}
