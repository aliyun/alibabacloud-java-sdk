// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RenewARMServerInstanceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the instance that you want to renew.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The renewal period. By default, instances are renewed on a monthly basis. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, and 12.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal period. Valid values:</p>
     * <br>
     * <p>*   Month (default)</p>
     * <p>*   Year</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    public static RenewARMServerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewARMServerInstanceRequest self = new RenewARMServerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewARMServerInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewARMServerInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewARMServerInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewARMServerInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

}
