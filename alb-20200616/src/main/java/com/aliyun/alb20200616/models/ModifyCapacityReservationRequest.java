// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a dry run request without reserving resources. The system checks required parameters, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Sends a normal request. After the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Application Load Balancing instance. Before you configure a capacity reservation, the instance must have at least one listener in the Running state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-iv9gj3spak6fbj****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The minimum reserved load balancing capacity.</p>
     */
    @NameInMap("MinimumLoadBalancerCapacity")
    public ModifyCapacityReservationRequestMinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    /**
     * <p>Specifies whether to cancel the capacity reservation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Cancels the capacity reservation.</li>
     * <li><strong>false</strong> (default): Does not cancel the capacity reservation. You do not need to specify this parameter when you create or modify a capacity reservation.</li>
     * </ul>
     * 
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
         * <p>The number of LCUs reserved per hour.</p>
         * 
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
