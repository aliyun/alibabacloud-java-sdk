// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseDDoSInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CleanTraffic</p>
     */
    @NameInMap("DDoSBillingMode")
    public String DDoSBillingMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_300</p>
     */
    @NameInMap("DDoSBurstableDomesticProtection")
    public String DDoSBurstableDomesticProtection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>overseas_300</p>
     */
    @NameInMap("DDoSBurstableOverseasProtection")
    public String DDoSBurstableOverseasProtection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-23kde*****</p>
     */
    @NameInMap("SiteInstanceId")
    public String siteInstanceId;

    public static PurchaseDDoSInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseDDoSInstanceRequest self = new PurchaseDDoSInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseDDoSInstanceRequest setDDoSBillingMode(String DDoSBillingMode) {
        this.DDoSBillingMode = DDoSBillingMode;
        return this;
    }
    public String getDDoSBillingMode() {
        return this.DDoSBillingMode;
    }

    public PurchaseDDoSInstanceRequest setDDoSBurstableDomesticProtection(String DDoSBurstableDomesticProtection) {
        this.DDoSBurstableDomesticProtection = DDoSBurstableDomesticProtection;
        return this;
    }
    public String getDDoSBurstableDomesticProtection() {
        return this.DDoSBurstableDomesticProtection;
    }

    public PurchaseDDoSInstanceRequest setDDoSBurstableOverseasProtection(String DDoSBurstableOverseasProtection) {
        this.DDoSBurstableOverseasProtection = DDoSBurstableOverseasProtection;
        return this;
    }
    public String getDDoSBurstableOverseasProtection() {
        return this.DDoSBurstableOverseasProtection;
    }

    public PurchaseDDoSInstanceRequest setSiteInstanceId(String siteInstanceId) {
        this.siteInstanceId = siteInstanceId;
        return this;
    }
    public String getSiteInstanceId() {
        return this.siteInstanceId;
    }

}
