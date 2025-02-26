// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewAndroidInstanceGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables the auto-payment feature. Ensure your account has sufficient balance to use this feature.</li>
     * <li>false: disables the auto-payment feature. You need to manually complete the payment process.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The IDs of the instance groups.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The duration of the renewal, measured in units defined by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration. Default value: Month.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    public static RenewAndroidInstanceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAndroidInstanceGroupsRequest self = new RenewAndroidInstanceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public RenewAndroidInstanceGroupsRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewAndroidInstanceGroupsRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public RenewAndroidInstanceGroupsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewAndroidInstanceGroupsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

}
