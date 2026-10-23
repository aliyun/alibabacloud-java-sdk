// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCapacityReservationsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeploymentSets")
    public String deploymentSetsShrink;

    @NameInMap("MinimumTransitRouterCapacities")
    public String minimumTransitRouterCapacitiesShrink;

    @NameInMap("ResetCapacityReservations")
    public String resetCapacityReservationsShrink;

    /**
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
