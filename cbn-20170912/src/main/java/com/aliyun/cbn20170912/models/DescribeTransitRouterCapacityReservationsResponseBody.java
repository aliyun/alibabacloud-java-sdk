// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("DeploymentSets")
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyDeploymentSets> deploymentSets;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-19T06:31:49Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("MinimumTransitRouterCapacities")
    public java.util.List<DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacities> minimumTransitRouterCapacities;

    /**
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
         * <strong>example:</strong>
         * <p>ds-badxcs*****</p>
         */
        @NameInMap("DeploymentSetID")
        public String deploymentSetID;

        /**
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
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Effective")
        public Long effective;

        /**
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
         * <strong>example:</strong>
         * <p>Reservation.InsufficientCapacity</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
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
        @NameInMap("DataProcessGbps")
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesDataProcessGbps dataProcessGbps;

        @NameInMap("State")
        public DescribeTransitRouterCapacityReservationsResponseBodyMinimumTransitRouterCapacitiesState state;

        /**
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
