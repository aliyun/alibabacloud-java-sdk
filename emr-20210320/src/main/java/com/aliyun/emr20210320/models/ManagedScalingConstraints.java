// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ManagedScalingConstraints extends TeaModel {
    /**
     * <p>最大值。</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("MaxCapacity")
    public Integer maxCapacity;

    /**
     * <p>最大按量节点数量</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxOnDemandCapacity")
    public Integer maxOnDemandCapacity;

    /**
     * <p>最小值。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinCapacity")
    public Integer minCapacity;

    public static ManagedScalingConstraints build(java.util.Map<String, ?> map) throws Exception {
        ManagedScalingConstraints self = new ManagedScalingConstraints();
        return TeaModel.build(map, self);
    }

    public ManagedScalingConstraints setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    public ManagedScalingConstraints setMaxOnDemandCapacity(Integer maxOnDemandCapacity) {
        this.maxOnDemandCapacity = maxOnDemandCapacity;
        return this;
    }
    public Integer getMaxOnDemandCapacity() {
        return this.maxOnDemandCapacity;
    }

    public ManagedScalingConstraints setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

}
