// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerRequest extends TeaModel {
    // 最大 replica 数，需要大于MinReplica
    @NameInMap("Max")
    public Integer max;

    // 最小 replica 数，需要大于0
    @NameInMap("Min")
    public Integer min;

    // map 类型的策略定义
    @NameInMap("Strategies")
    public CreateServiceAutoScalerRequestStrategies strategies;

    public static CreateServiceAutoScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAutoScalerRequest self = new CreateServiceAutoScalerRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceAutoScalerRequest setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public CreateServiceAutoScalerRequest setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public CreateServiceAutoScalerRequest setStrategies(CreateServiceAutoScalerRequestStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public CreateServiceAutoScalerRequestStrategies getStrategies() {
        return this.strategies;
    }

    public static class CreateServiceAutoScalerRequestStrategies extends TeaModel {
        // 最大 replica 数，需要大于MinReplica
        @NameInMap("Cpu")
        public Float cpu;

        // 每个实例支持的最大qps数，超出即扩容
        @NameInMap("Qps")
        public Float qps;

        public static CreateServiceAutoScalerRequestStrategies build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestStrategies self = new CreateServiceAutoScalerRequestStrategies();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestStrategies setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateServiceAutoScalerRequestStrategies setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

    }

}
