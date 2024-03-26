// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoScalingPolicy extends TeaModel {
    @NameInMap("constraints")
    public Constraints constraints;

    @NameInMap("scalingRules")
    public java.util.List<ScalingRule> scalingRules;

    public static AutoScalingPolicy build(java.util.Map<String, ?> map) throws Exception {
        AutoScalingPolicy self = new AutoScalingPolicy();
        return TeaModel.build(map, self);
    }

    public AutoScalingPolicy setConstraints(Constraints constraints) {
        this.constraints = constraints;
        return this;
    }
    public Constraints getConstraints() {
        return this.constraints;
    }

    public AutoScalingPolicy setScalingRules(java.util.List<ScalingRule> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

    public static class Constraints extends TeaModel {
        @NameInMap("maxCapacity")
        public Integer maxCapacity;

        @NameInMap("minCapacity")
        public Integer minCapacity;

        public static Constraints build(java.util.Map<String, ?> map) throws Exception {
            Constraints self = new Constraints();
            return TeaModel.build(map, self);
        }

        public Constraints setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public Constraints setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

}
