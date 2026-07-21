// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringResponseBody extends TeaModel {
    /**
     * <p>The list of coordination flow data.</p>
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
         * <p>The coordination flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>co-0sot77uale3****</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <p>The current coordination status.
         * [_single.resp.200.props.CoordinateFlowModels.items.CoordinateStatus.enum.COORDINATING  ]coordinating
         * [_single.resp.200.props.CoordinateFlowModels.items.CoordinateStatus.enum.TERMINATING  ] terminating
         * [_single.resp.200.props.CoordinateFlowModels.items.CoordinateStatus.enum.TERMINATED ]terminated
         * [_single.resp.200.props.CoordinateFlowModels.items.CoordinateStatus.enum.PENDING ]pending acceptance</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        /**
         * <p>The ticket used by ASP to establish a connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1VDQ0VTUw0KW0Rlc2t0b3BdDQpHV1Rva2VuPTAwTzgwL3liS25zUEVGdkF6eU1Pc1ExeHZWdmk4VEE3NFJvU1V1d0dPYm1BNkNJWklDMHVNQklWcjU2NS80S0ZQekQ4aGFTR0ZHelZqMTFGbkRpWWgvUFF1Zm1xSXNGdFRFNFRWMExJNit3TkU0L2RMb04wNXBBSE5Tc3M4dWFXY3lwWE****</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <p>The initiator type.</p>
         * 
         * <strong>example:</strong>
         * <p>COORDINATOR_INITIATE_FORCE</p>
         */
        @NameInMap("InitiatorType")
        public String initiatorType;

        /**
         * <p>The Alibaba Cloud account ID of the user on the user side.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-96vi03f9emqnl****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
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
