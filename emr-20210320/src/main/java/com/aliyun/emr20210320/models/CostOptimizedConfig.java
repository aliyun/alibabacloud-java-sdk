// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CostOptimizedConfig extends TeaModel {
    /**
     * <p>The minimum number of pay-as-you-go instances that are required for the node group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, pay-as-you-go instances are preferentially created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of pay-as-you-go instances among the instances that exceed the number specified by the OnDemandBaseCapacity parameter for the node group. Valid values: 0 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    /**
     * <p>The number of instance types that are specified. Preemptible instances of multiple instance types that are provided at the lowest price are evenly created in the scaling group. Valid values: 0 to 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    public static CostOptimizedConfig build(java.util.Map<String, ?> map) throws Exception {
        CostOptimizedConfig self = new CostOptimizedConfig();
        return TeaModel.build(map, self);
    }

    public CostOptimizedConfig setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public CostOptimizedConfig setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public CostOptimizedConfig setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

}
