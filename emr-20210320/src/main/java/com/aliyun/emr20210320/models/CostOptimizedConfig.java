// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CostOptimizedConfig extends TeaModel {
    /**
     * <p>按量实例个数的最小值。节点组所需要按量实例个数的最小值，取值范围：0~1000。当按量实例个数少于该值时，将优先创建按量实例。</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>节点组满足最小按量实例OnDemandBaseCapacity要求后，超出的实例中按量实例应占的比例，取值范围：0～100。</p>
     */
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    /**
     * <p>指定可用实例规格的个数，伸缩组将按成本最低的多个规格均衡创建抢占式实例。取值范围：0~10。</p>
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
