// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID of the target instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1u0639js2h7****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The renewal epoch for the target instance.</p>
     * <ul>
     * <li>If PricingCycle is set to <strong>year</strong>, valid values are 1 to 3.</li>
     * <li>If PricingCycle is set to <strong>month</strong>, valid values are 1 to 9.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The unit of the renewal epoch for the target instance.</p>
     * <ul>
     * <li><strong>year</strong>: year.</li>
     * <li><strong>month</strong>: month.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RenewInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RenewInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
