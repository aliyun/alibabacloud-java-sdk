// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment when you change the billing method from pay-as-you-go to subscription. Valid values:</p>
     * <p>true: enables auto-payment. Make sure that your account has sufficient balance.</p>
     * <p>false (default): does not enable auto-payment. The order is generated but not paid.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal when you change the billing method from pay-as-you-go to subscription. Valid values:</p>
     * <p>true</p>
     * <p>false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to change the billing method of all data disks that are created with the instance to subscription when you change the billing method of the instance from pay-as-you-go to subscription. Valid values:</p>
     * <p>true</p>
     * <p>false (default)</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDataDisks")
    public Boolean includeDataDisks;

    /**
     * <p>The new billing method. Valid values:</p>
     * <p>PrePaid</p>
     * <p>PostPaid (default)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The subscription duration. This parameter is required if you set the InstanceChargeType parameter to PrePaid. Valid values:</p>
     * <p>If the PeriodUnit parameter is set to Day, Period can only be set to 3.</p>
     * <p>If PeriodUnit is Month, Period can be set to 1 to 9 or 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The unit of the subscription duration. This parameter is required if you set the InstanceChargeType parameter to PrePaid. Examples:</p>
     * <p>Month</p>
     * <p>Day</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * <li>Day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    public static ModifyInstanceChargeTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeShrinkRequest self = new ModifyInstanceChargeTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceChargeTypeShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyInstanceChargeTypeShrinkRequest setIncludeDataDisks(Boolean includeDataDisks) {
        this.includeDataDisks = includeDataDisks;
        return this;
    }
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    public ModifyInstanceChargeTypeShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyInstanceChargeTypeShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ModifyInstanceChargeTypeShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public ModifyInstanceChargeTypeShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

}
