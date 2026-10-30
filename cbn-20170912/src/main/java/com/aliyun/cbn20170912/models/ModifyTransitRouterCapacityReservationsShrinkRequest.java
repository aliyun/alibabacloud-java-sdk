// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCapacityReservationsShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the token on your client to ensure that the token is unique across different requests. The client token only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request ID of the API request as the client token. The request ID may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment set information for the capacity reservation.</p>
     */
    @NameInMap("DeploymentSets")
    public String deploymentSetsShrink;

    /**
     * <p>The reserved capacity for each zone in the capacity reservation.</p>
     */
    @NameInMap("MinimumTransitRouterCapacities")
    public String minimumTransitRouterCapacitiesShrink;

    /**
     * <p>Cancels capacity reservations.</p>
     */
    @NameInMap("ResetCapacityReservations")
    public String resetCapacityReservationsShrink;

    /**
     * <p>The ID of the transit router instance for forward routing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("Version")
    public String version;

    public static ModifyTransitRouterCapacityReservationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCapacityReservationsShrinkRequest self = new ModifyTransitRouterCapacityReservationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setDeploymentSetsShrink(String deploymentSetsShrink) {
        this.deploymentSetsShrink = deploymentSetsShrink;
        return this;
    }
    public String getDeploymentSetsShrink() {
        return this.deploymentSetsShrink;
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setMinimumTransitRouterCapacitiesShrink(String minimumTransitRouterCapacitiesShrink) {
        this.minimumTransitRouterCapacitiesShrink = minimumTransitRouterCapacitiesShrink;
        return this;
    }
    public String getMinimumTransitRouterCapacitiesShrink() {
        return this.minimumTransitRouterCapacitiesShrink;
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setResetCapacityReservationsShrink(String resetCapacityReservationsShrink) {
        this.resetCapacityReservationsShrink = resetCapacityReservationsShrink;
        return this;
    }
    public String getResetCapacityReservationsShrink() {
        return this.resetCapacityReservationsShrink;
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ModifyTransitRouterCapacityReservationsShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
