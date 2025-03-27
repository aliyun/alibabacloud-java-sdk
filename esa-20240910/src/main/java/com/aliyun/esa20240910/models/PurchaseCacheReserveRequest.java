// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseCacheReserveRequest extends TeaModel {
    /**
     * <p>Whether to automatically pay. The default value is false.</p>
     * <ul>
     * <li>true: Automatically pay.</li>
     * <li>false: Do not automatically pay.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Whether to auto-renew:</p>
     * <ul>
     * <li>true: Auto-renew.</li>
     * <li>false: Do not auto-renew.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Billing type</p>
     * <ul>
     * <li>PREPAY: Prepaid.</li>
     * <li>POSTPAY: Postpaid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Cache retention region</p>
     * <ul>
     * <li>HK: Hong Kong, China</li>
     * <li>CN-beijing: Mainland China - Beijing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HK</p>
     */
    @NameInMap("CrRegion")
    public String crRegion;

    /**
     * <p>Purchase period (unit: month).</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>Cache retention specification (unit: GB).</p>
     * 
     * <strong>example:</strong>
     * <p>512000</p>
     */
    @NameInMap("QuotaGb")
    public Long quotaGb;

    public static PurchaseCacheReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseCacheReserveRequest self = new PurchaseCacheReserveRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseCacheReserveRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public PurchaseCacheReserveRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public PurchaseCacheReserveRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public PurchaseCacheReserveRequest setCrRegion(String crRegion) {
        this.crRegion = crRegion;
        return this;
    }
    public String getCrRegion() {
        return this.crRegion;
    }

    public PurchaseCacheReserveRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseCacheReserveRequest setQuotaGb(Long quotaGb) {
        this.quotaGb = quotaGb;
        return this;
    }
    public Long getQuotaGb() {
        return this.quotaGb;
    }

}
