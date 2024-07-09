// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true (default): enables the auto-payment feature.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
     * <!-- -->
     * </li>
     * <li><p>false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>To make the payment, log on to the Elastic Desktop Service console, go to the Orders page, and find the order based on the order ID.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The IDs of premium bandwidth plans. You can specify up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    /**
     * <p>The subscription duration if you specify subscription as the new billing method for the cloud desktop. The unit of the value is specified by the <code>PeriodUnit</code> parameter. This parameter takes effect only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>.</p>
     * <ul>
     * <li>If the <code>PeriodUnit</code> parameter is set to <code>Week</code>, the valid value of the Period parameter is 1.</li>
     * <li>If the <code>PeriodUnit</code> parameter is set to <code>Month</code>, the valid values of the Period parameter are 1, 2, 3, and 6.</li>
     * <li>If the <code>PeriodUnit</code> parameter is set to <code>Year</code>, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration specified by the Period parameter. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>500038360030606</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenewNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewNetworkPackagesRequest self = new RenewNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public RenewNetworkPackagesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public RenewNetworkPackagesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewNetworkPackagesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewNetworkPackagesRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
