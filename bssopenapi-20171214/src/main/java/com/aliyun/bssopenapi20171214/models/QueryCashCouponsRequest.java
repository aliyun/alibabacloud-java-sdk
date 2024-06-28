// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsRequest extends TeaModel {
    /**
     * <p>Specifies whether the voucher takes effect. Valid values:</p>
     * <ul>
     * <li>true: The voucher takes effect.</li>
     * <li>false: The voucher does not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    /**
     * <p>The end time of the validity period of the voucher. Specify the parameter in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-08-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-01T00:00:00Z</p>
     */
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    /**
     * <p>The start time of the validity period of the voucher. Specify the parameter in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-08-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-01T00:00:00Z</p>
     */
    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    public static QueryCashCouponsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsRequest self = new QueryCashCouponsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsRequest setEffectiveOrNot(Boolean effectiveOrNot) {
        this.effectiveOrNot = effectiveOrNot;
        return this;
    }
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    public QueryCashCouponsRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryCashCouponsRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

}
