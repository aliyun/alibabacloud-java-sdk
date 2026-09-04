// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a token from your client and make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the system uses the RequestId as the ClientToken. The RequestId of each API request is different.</p>
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
     * <li><p><strong>true</strong>: Sends a check request but does not reserve any resources. The system checks the request for required parameters, format, and service limits. If the check fails, an error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. After the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Application Load Balancer (ALB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-iv9gj3spak6fbj****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The minimum LCU value to reserve.</p>
     */
    @NameInMap("MinimumLoadBalancerCapacity")
    public ModifyCapacityReservationRequestMinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    /**
     * <p>Specifies whether to cancel the LCU reservation. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Cancels the LCU reservation.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Does not cancel the LCU reservation. You do not need to specify this parameter when creating or updating an LCU reservation.</p>
     * </li>
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
         * <p>The number of LCUs to reserve per hour.</p>
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
