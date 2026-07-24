// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSPriceRequest extends TeaModel {
    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CleanTraffic</p>
     */
    @NameInMap("DDoSBillingMode")
    public String DDoSBillingMode;

    /**
     * <p>The instance specifications for the Chinese mainland.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_300</p>
     */
    @NameInMap("DDoSBurstableDomesticProtection")
    public String DDoSBurstableDomesticProtection;

    /**
     * <p>The instance specifications for regions outside the Chinese mainland.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>overseas_300</p>
     */
    @NameInMap("DDoSBurstableOverseasProtection")
    public String DDoSBurstableOverseasProtection;

    public static DescribeDDoSPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSPriceRequest self = new DescribeDDoSPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSPriceRequest setDDoSBillingMode(String DDoSBillingMode) {
        this.DDoSBillingMode = DDoSBillingMode;
        return this;
    }
    public String getDDoSBillingMode() {
        return this.DDoSBillingMode;
    }

    public DescribeDDoSPriceRequest setDDoSBurstableDomesticProtection(String DDoSBurstableDomesticProtection) {
        this.DDoSBurstableDomesticProtection = DDoSBurstableDomesticProtection;
        return this;
    }
    public String getDDoSBurstableDomesticProtection() {
        return this.DDoSBurstableDomesticProtection;
    }

    public DescribeDDoSPriceRequest setDDoSBurstableOverseasProtection(String DDoSBurstableOverseasProtection) {
        this.DDoSBurstableOverseasProtection = DDoSBurstableOverseasProtection;
        return this;
    }
    public String getDDoSBurstableOverseasProtection() {
        return this.DDoSBurstableOverseasProtection;
    }

}
