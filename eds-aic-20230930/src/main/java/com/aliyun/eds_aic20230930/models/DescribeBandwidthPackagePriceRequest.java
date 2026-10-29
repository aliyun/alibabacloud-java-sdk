// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagePriceRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the network. Unit: Mbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method of the bandwidth plan. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong> (default): billing by bandwidth.</li>
     * <li><strong>PayBy95</strong>: billing by traditional 95th percentile. IPv6 Internet bandwidth does not support billing by traditional 95th percentile by default. To use this billing method, contact your account manager.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong> (default): billing by bandwidth.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The subscription duration of the resource. The unit is specified by <code>PeriodUnit</code>. Valid values: 1 month, 2 months, 3 months, 6 months, 1 year, 2 years, and 3 years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration of the resource. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Month.</li>
     * <li><strong>Year</strong>: Year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotion.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The payment channel.</p>
     * 
     * <strong>example:</strong>
     * <p>JvsMobile</p>
     */
    @NameInMap("PurchaseChannelType")
    public String purchaseChannelType;

    public static DescribeBandwidthPackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagePriceRequest self = new DescribeBandwidthPackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagePriceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeBandwidthPackagePriceRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeBandwidthPackagePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeBandwidthPackagePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeBandwidthPackagePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeBandwidthPackagePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public DescribeBandwidthPackagePriceRequest setPurchaseChannelType(String purchaseChannelType) {
        this.purchaseChannelType = purchaseChannelType;
        return this;
    }
    public String getPurchaseChannelType() {
        return this.purchaseChannelType;
    }

}
