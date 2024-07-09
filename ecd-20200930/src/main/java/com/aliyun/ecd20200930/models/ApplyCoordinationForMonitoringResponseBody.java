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
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
         * 
         * <strong>example:</strong>
         * <p>co-0sot77uale3****</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <p>The current status of the collaboration task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>COORDINATING: The collaboration task is being executed.</p>
         * </li>
         * <li><p>TERMINATING: The collaboration task is being terminated.</p>
         * </li>
         * <li><p>TERMINATED: The collaboration task is terminated.</p>
         * </li>
         * <li><p>PENDING: The collaboration task is pending to be executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        /**
         * <p>The ticket that is used to establish the Adaptive Streaming Protocol (ASP)-based connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1VDQ0VTUw0KW0Rlc2t0b3BdDQpHV1Rva2VuPTAwTzgwL3liS25zUEVGdkF6eU1Pc1ExeHZWdmk4VEE3NFJvU1V1d0dPYm1BNkNJWklDMHVNQklWcjU2NS80S0ZQekQ4aGFTR0ZHelZqMTFGbkRpWWgvUFF1Zm1xSXNGdFRFNFRWMExJNit3TkU0L2RMb04wNXBBSE5Tc3M4dWFXY3lwWE****</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <p>The type of the initiator.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ADMIN_INITIATE_FORCE: The administrator forcibly initiates the collaboration request.</p>
         * </li>
         * <li><p>ADMIN_INITIATE: The administrator initiates the collaboration request.</p>
         * </li>
         * <li><p>COORDINATOR_INITIATE_FORCE: The coordinator forcibly initiates the collaboration request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COORDINATOR_INITIATE_FORCE</p>
         */
        @NameInMap("InitiatorType")
        public String initiatorType;

        /**
         * <p>The ID of the Alibaba Cloud account of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-96vi03f9emqnl****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDesktop</p>
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
