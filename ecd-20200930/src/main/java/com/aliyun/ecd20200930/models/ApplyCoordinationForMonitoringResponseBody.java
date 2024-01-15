// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringResponseBody extends TeaModel {
    /**
     * <p>The list of stream collaboration models.</p>
     */
    @NameInMap("CoordinateFlowModels")
    public java.util.List<ApplyCoordinationForMonitoringResponseBodyCoordinateFlowModels> coordinateFlowModels;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the stream collaboration.</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <p>The current status of the collaboration task.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   COORDINATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The collaboration task is being executed</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   TERMINATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The collaboration task is being terminated</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   TERMINATED</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The collaboration task is terminated</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   PENDING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The collaboration task is pending to be executed</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        /**
         * <p>The ticket that is used to establish the Adaptive Streaming Protocol (ASP)-based connection.</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <p>The type of the initiator.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ADMIN_INITIATE_FORCE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The administrator forcibly initiates the collaboration request</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   ADMIN_INITIATE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The administrator initiates the collaboration request</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   COORDINATOR_INITIATE_FORCE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The coordinator forcibly initiates the collaboration request</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("InitiatorType")
        public String initiatorType;

        /**
         * <p>The ID of the Alibaba Cloud account of the end user.</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the cloud desktop.</p>
         */
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
