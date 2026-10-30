// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCapacityReservationsRequest extends TeaModel {
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
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestDeploymentSets> deploymentSets;

    /**
     * <p>The reserved capacity for each zone in the capacity reservation.</p>
     */
    @NameInMap("MinimumTransitRouterCapacities")
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities> minimumTransitRouterCapacities;

    /**
     * <p>Cancels capacity reservations.</p>
     */
    @NameInMap("ResetCapacityReservations")
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations> resetCapacityReservations;

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

    public static ModifyTransitRouterCapacityReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCapacityReservationsRequest self = new ModifyTransitRouterCapacityReservationsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCapacityReservationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterCapacityReservationsRequest setDeploymentSets(java.util.List<ModifyTransitRouterCapacityReservationsRequestDeploymentSets> deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestDeploymentSets> getDeploymentSets() {
        return this.deploymentSets;
    }

    public ModifyTransitRouterCapacityReservationsRequest setMinimumTransitRouterCapacities(java.util.List<ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities> minimumTransitRouterCapacities) {
        this.minimumTransitRouterCapacities = minimumTransitRouterCapacities;
        return this;
    }
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities> getMinimumTransitRouterCapacities() {
        return this.minimumTransitRouterCapacities;
    }

    public ModifyTransitRouterCapacityReservationsRequest setResetCapacityReservations(java.util.List<ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations> resetCapacityReservations) {
        this.resetCapacityReservations = resetCapacityReservations;
        return this;
    }
    public java.util.List<ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations> getResetCapacityReservations() {
        return this.resetCapacityReservations;
    }

    public ModifyTransitRouterCapacityReservationsRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ModifyTransitRouterCapacityReservationsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ModifyTransitRouterCapacityReservationsRequestDeploymentSets extends TeaModel {
        /**
         * <p>The ID of the deployment set instance used.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-badxcs*****</p>
         */
        @NameInMap("DeploymentSetID")
        public String deploymentSetID;

        /**
         * <p>The zone for which to modify the deployment set of the capacity reservation.</p>
         * <ul>
         * <li>To cancel the deployment set, specify the zone and leave the deployment set ID empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        public static ModifyTransitRouterCapacityReservationsRequestDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            ModifyTransitRouterCapacityReservationsRequestDeploymentSets self = new ModifyTransitRouterCapacityReservationsRequestDeploymentSets();
            return TeaModel.build(map, self);
        }

        public ModifyTransitRouterCapacityReservationsRequestDeploymentSets setDeploymentSetID(String deploymentSetID) {
            this.deploymentSetID = deploymentSetID;
            return this;
        }
        public String getDeploymentSetID() {
            return this.deploymentSetID;
        }

        public ModifyTransitRouterCapacityReservationsRequestDeploymentSets setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

    }

    public static class ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps extends TeaModel {
        /**
         * <p>The target reserved capacity for the specified zone.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Target")
        public Long target;

        public static ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps build(java.util.Map<String, ?> map) throws Exception {
            ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps self = new ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps();
            return TeaModel.build(map, self);
        }

        public ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities extends TeaModel {
        /**
         * <p>The reserved capacity for the specified zone.</p>
         */
        @NameInMap("DataProcessGbps")
        public ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps dataProcessGbps;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-l</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities build(java.util.Map<String, ?> map) throws Exception {
            ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities self = new ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities();
            return TeaModel.build(map, self);
        }

        public ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities setDataProcessGbps(ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps dataProcessGbps) {
            this.dataProcessGbps = dataProcessGbps;
            return this;
        }
        public ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacitiesDataProcessGbps getDataProcessGbps() {
            return this.dataProcessGbps;
        }

        public ModifyTransitRouterCapacityReservationsRequestMinimumTransitRouterCapacities setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations extends TeaModel {
        /**
         * <p>The ID of the zone for which to cancel the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations build(java.util.Map<String, ?> map) throws Exception {
            ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations self = new ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations();
            return TeaModel.build(map, self);
        }

        public ModifyTransitRouterCapacityReservationsRequestResetCapacityReservations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
