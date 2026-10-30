// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterCapacityReservationsResponseBody extends TeaModel {
    /**
     * <p>The deployment set information specified for the resource reservation.</p>
     */
    @NameInMap("DeploymentSets")
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets> deploymentSets;

    /**
     * <p>The time when the resource reservation was last modified.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-19T06:31:49Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The list of reserved capacity information for each zone in the resource reservation.</p>
     */
    @NameInMap("MinimumTransitRouterCapacities")
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities> minimumTransitRouterCapacities;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTransitRouterCapacityReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterCapacityReservationsResponseBody self = new DescribeTransitRouterCapacityReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterCapacityReservationsResponseBody setDeploymentSets(java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets> deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets> getDeploymentSets() {
        return this.deploymentSets;
    }

    public DescribeTransitRouterCapacityReservationsResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeTransitRouterCapacityReservationsResponseBody setMinimumTransitRouterCapacities(java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities> minimumTransitRouterCapacities) {
        this.minimumTransitRouterCapacities = minimumTransitRouterCapacities;
        return this;
    }
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities> getMinimumTransitRouterCapacities() {
        return this.minimumTransitRouterCapacities;
    }

    public DescribeTransitRouterCapacityReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets extends TeaModel {
        /**
         * <p>The instance ID of the deployment set configured in the specified active zone of the transit router, which handles forward and routing tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-badxcs*****</p>
         */
        @NameInMap("DeploymentSetID")
        public String deploymentSetID;

        /**
         * <p>The zone for which you want to modify the deployment set of the resource reservation.</p>
         * <ul>
         * <li>To cancel the deployment set, specify the zone and leave the deployment set instance ID empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        public static DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets self = new DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets setDeploymentSetID(String deploymentSetID) {
            this.deploymentSetID = deploymentSetID;
            return this;
        }
        public String getDeploymentSetID() {
            return this.deploymentSetID;
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

    }

    public static class DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps extends TeaModel {
        /**
         * <p>The effective reserved value for the specified zone in the resource reservation.</p>
         * <ul>
         * <li>The effective reserved value refers to the current billed value for the resource reservation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Effective")
        public Long effective;

        /**
         * <p>The target reserved value for the specified active zone in the resource reservation.</p>
         * <ul>
         * <li>In scenarios where you decrease the quota, the change takes effect in the next month, and the effective reserved value is updated in synchronization.</li>
         * <li>Upgrade and initial reservation scenarios require spooling by Alibaba Cloud and take effect immediately after the spooling is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Target")
        public Long target;

        public static DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps self = new DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps setEffective(Long effective) {
            this.effective = effective;
            return this;
        }
        public Long getEffective() {
            return this.effective;
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState extends TeaModel {
        /**
         * <p>The reason for failure when the reservation status is ProvisionFailed.</p>
         * <ul>
         * <li>For example, Reservation.InsufficientCapacity indicates that resources are insufficient to meet the target reserved value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reservation.InsufficientCapacity</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The resource reservation status. Valid values:</p>
         * <ul>
         * <li>Pending: The initial reservation is initiated and is pending processing by Alibaba Cloud.</li>
         * <li>Provisioning: Alibaba Cloud is processing the reservation request.</li>
         * <li>Provisioned: The reservation is successful.</li>
         * <li>ProvisionFailed: The reservation failed. You can refer to the failure reason.</li>
         * <li>Updating: The reservation is being updated. Operations such as modifying the deployment set or increasing the reserved value require spooling by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState self = new DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities extends TeaModel {
        /**
         * <p>The reserved capacity information for the specified zone in the resource reservation.</p>
         */
        @NameInMap("DataProcessGbps")
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps dataProcessGbps;

        /**
         * <p>The status information of the specified zone in the resource reservation.</p>
         */
        @NameInMap("State")
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState state;

        /**
         * <p>The ID of the specified zone for the resource reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities self = new DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities setDataProcessGbps(DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps dataProcessGbps) {
            this.dataProcessGbps = dataProcessGbps;
            return this;
        }
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps getDataProcessGbps() {
            return this.dataProcessGbps;
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities setState(DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState state) {
            this.state = state;
            return this;
        }
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState getState() {
            return this.state;
        }

        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
