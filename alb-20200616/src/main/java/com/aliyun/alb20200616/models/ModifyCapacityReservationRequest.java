// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-iv9gj3spak6fbj****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("MinimumLoadBalancerCapacity")
    public ModifyCapacityReservationRequestMinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ResetCapacityReservation")
    public Boolean resetCapacityReservation;

    public static ModifyCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCapacityReservationRequest self = new ModifyCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCapacityReservationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyCapacityReservationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyCapacityReservationRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public ModifyCapacityReservationRequest setMinimumLoadBalancerCapacity(ModifyCapacityReservationRequestMinimumLoadBalancerCapacity minimumLoadBalancerCapacity) {
        this.minimumLoadBalancerCapacity = minimumLoadBalancerCapacity;
        return this;
    }
    public ModifyCapacityReservationRequestMinimumLoadBalancerCapacity getMinimumLoadBalancerCapacity() {
        return this.minimumLoadBalancerCapacity;
    }

    public ModifyCapacityReservationRequest setResetCapacityReservation(Boolean resetCapacityReservation) {
        this.resetCapacityReservation = resetCapacityReservation;
        return this;
    }
    public Boolean getResetCapacityReservation() {
        return this.resetCapacityReservation;
    }

    public static class ModifyCapacityReservationRequestMinimumLoadBalancerCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnits")
        public Integer capacityUnits;

        public static ModifyCapacityReservationRequestMinimumLoadBalancerCapacity build(java.util.Map<String, ?> map) throws Exception {
            ModifyCapacityReservationRequestMinimumLoadBalancerCapacity self = new ModifyCapacityReservationRequestMinimumLoadBalancerCapacity();
            return TeaModel.build(map, self);
        }

        public ModifyCapacityReservationRequestMinimumLoadBalancerCapacity setCapacityUnits(Integer capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

    }

}
