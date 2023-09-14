// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingConstraints extends TeaModel {
    /**
     * <p>最大值。</p>
     */
    @NameInMap("MaxCapacity")
    public Integer maxCapacity;

    /**
     * <p>最小值。</p>
     */
    @NameInMap("MinCapacity")
    public Integer minCapacity;

    public static ScalingConstraints build(java.util.Map<String, ?> map) throws Exception {
        ScalingConstraints self = new ScalingConstraints();
        return TeaModel.build(map, self);
    }

    public ScalingConstraints setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    public ScalingConstraints setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

}
