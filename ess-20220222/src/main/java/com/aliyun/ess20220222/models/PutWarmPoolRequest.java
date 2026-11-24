// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class PutWarmPoolRequest extends TeaModel {
    /**
     * <p>The capacity options for the warm pool.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CapacityOptions")
    public PutWarmPoolRequestCapacityOptions capacityOptions;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance reclaim policy.</p>
     */
    @NameInMap("InstanceReusePolicy")
    public PutWarmPoolRequestInstanceReusePolicy instanceReusePolicy;

    /**
     * <p>The state of instances in the warm pool. Valid values:</p>
     * <ul>
     * <li>Running: The instances are in the running state. This state allows faster scale-out, but you are charged for the full cost of the instances.</li>
     * <li>Stopped: The instances are in the economical mode. You are charged only for resources such as cloud disks, elastic IP addresses (EIPs), and snapshots of the instances. However, instance startup may fail during scale-out due to insufficient inventory.</li>
     * </ul>
     * <p>Default value: Stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("PoolState")
    public String poolState;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1fo0dbtsbmqa9h****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static PutWarmPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        PutWarmPoolRequest self = new PutWarmPoolRequest();
        return TeaModel.build(map, self);
    }

    public PutWarmPoolRequest setCapacityOptions(PutWarmPoolRequestCapacityOptions capacityOptions) {
        this.capacityOptions = capacityOptions;
        return this;
    }
    public PutWarmPoolRequestCapacityOptions getCapacityOptions() {
        return this.capacityOptions;
    }

    public PutWarmPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutWarmPoolRequest setInstanceReusePolicy(PutWarmPoolRequestInstanceReusePolicy instanceReusePolicy) {
        this.instanceReusePolicy = instanceReusePolicy;
        return this;
    }
    public PutWarmPoolRequestInstanceReusePolicy getInstanceReusePolicy() {
        return this.instanceReusePolicy;
    }

    public PutWarmPoolRequest setPoolState(String poolState) {
        this.poolState = poolState;
        return this;
    }
    public String getPoolState() {
        return this.poolState;
    }

    public PutWarmPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutWarmPoolRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class PutWarmPoolRequestCapacityOptions extends TeaModel {
        /**
         * <p>The expected number of instances to be warmed. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value. Instances that exceed the current number of instances in the scaling group are scaled out into the warm pool in advance. When traffic peaks occur, instances can be quickly added from the warm pool, avoiding the wait time caused by creating instances on demand.</p>
         * <p>Default value: the maximum number of instances in the scaling group, which is specified by <code>MaxSize</code>.</p>
         * <blockquote>
         * <p>The value of <code>DesiredGroupPreparedCapacity</code> must be less than or equal to the maximum number of instances in the scaling group, which is specified by <code>MaxSize</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DesiredGroupPreparedCapacity")
        public Integer desiredGroupPreparedCapacity;

        /**
         * <p>The minimum number of instances in the warm pool. The system always keeps at least this number of warmed instances in the warm pool to ensure that instances can be quickly added from the warm pool during scale-out.</p>
         * <p>Default value: 0.</p>
         * <blockquote>
         * <p>The value of <code>MinCapacity</code> must be less than or equal to the value of <code>DesiredGroupPreparedCapacity</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCapacity")
        public Integer minCapacity;

        public static PutWarmPoolRequestCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            PutWarmPoolRequestCapacityOptions self = new PutWarmPoolRequestCapacityOptions();
            return TeaModel.build(map, self);
        }

        public PutWarmPoolRequestCapacityOptions setDesiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
            this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
            return this;
        }
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        public PutWarmPoolRequestCapacityOptions setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

    public static class PutWarmPoolRequestInstanceReusePolicy extends TeaModel {
        /**
         * <p>Specifies whether instances are reclaimed to the warm pool when the scaling group scales in. Valid values:</p>
         * <ul>
         * <li>true: Instances are reclaimed to the warm pool.</li>
         * <li>false: Instances are not reclaimed to the warm pool.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReuseOnScaleIn")
        public Boolean reuseOnScaleIn;

        public static PutWarmPoolRequestInstanceReusePolicy build(java.util.Map<String, ?> map) throws Exception {
            PutWarmPoolRequestInstanceReusePolicy self = new PutWarmPoolRequestInstanceReusePolicy();
            return TeaModel.build(map, self);
        }

        public PutWarmPoolRequestInstanceReusePolicy setReuseOnScaleIn(Boolean reuseOnScaleIn) {
            this.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }
        public Boolean getReuseOnScaleIn() {
            return this.reuseOnScaleIn;
        }

    }

}
