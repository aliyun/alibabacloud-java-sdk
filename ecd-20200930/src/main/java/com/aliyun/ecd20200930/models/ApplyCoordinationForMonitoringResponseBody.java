// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringResponseBody extends TeaModel {
    @NameInMap("CoordinateFlowModels")
    public java.util.List<ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels> coordinateFlowModels;

    @NameInMap("RequestId")
    public String requestId;

    public static ApplyCoordinationForMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForMonitoringResponseBody self = new ApplyCoordinationForMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForMonitoringResponseBody setCoordinateFlowModels(java.util.List<ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels> coordinateFlowModels) {
        this.coordinateFlowModels = coordinateFlowModels;
        return this;
    }
    public java.util.List<ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels> getCoordinateFlowModels() {
        return this.coordinateFlowModels;
    }

    public ApplyCoordinationForMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels extends TeaModel {
        @NameInMap("CoId")
        public String coId;

        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        @NameInMap("InitiatorType")
        public String initiatorType;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        public static ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels build(java.util.Map<String, ?> map) throws Exception {
            ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels self = new ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels();
            return TeaModel.build(map, self);
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setCoId(String coId) {
            this.coId = coId;
            return this;
        }
        public String getCoId() {
            return this.coId;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setCoordinateStatus(String coordinateStatus) {
            this.coordinateStatus = coordinateStatus;
            return this;
        }
        public String getCoordinateStatus() {
            return this.coordinateStatus;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setCoordinateTicket(String coordinateTicket) {
            this.coordinateTicket = coordinateTicket;
            return this;
        }
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setInitiatorType(String initiatorType) {
            this.initiatorType = initiatorType;
            return this;
        }
        public String getInitiatorType() {
            return this.initiatorType;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
