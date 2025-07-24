// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetManagedScalingPolicyResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingPolicy")
    public ScalingPolicy scalingPolicy;

    public static GetManagedScalingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedScalingPolicyResponseBody self = new GetManagedScalingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedScalingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagedScalingPolicyResponseBody setScalingPolicy(ScalingPolicy scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public ScalingPolicy getScalingPolicy() {
        return this.scalingPolicy;
    }

    public static class Constraints extends TeaModel {
        /**
         * <p>最大值</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>最大按量数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxOnDemandCapacity")
        public Integer maxOnDemandCapacity;

        /**
         * <p>最小值</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCapacity")
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

        public Constraints setMaxOnDemandCapacity(Integer maxOnDemandCapacity) {
            this.maxOnDemandCapacity = maxOnDemandCapacity;
            return this;
        }
        public Integer getMaxOnDemandCapacity() {
            return this.maxOnDemandCapacity;
        }

        public Constraints setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

    public static class ScalingPolicy extends TeaModel {
        /**
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>最大最小值约束</p>
         */
        @NameInMap("Constraints")
        public Constraints constraints;

        /**
         * <p>伸缩策略ID。</p>
         * 
         * <strong>example:</strong>
         * <p>asp-asduwe23znl***</p>
         */
        @NameInMap("ScalingPolicyId")
        public String scalingPolicyId;

        public static ScalingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ScalingPolicy self = new ScalingPolicy();
            return TeaModel.build(map, self);
        }

        public ScalingPolicy setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ScalingPolicy setConstraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public Constraints getConstraints() {
            return this.constraints;
        }

        public ScalingPolicy setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

    }

}
