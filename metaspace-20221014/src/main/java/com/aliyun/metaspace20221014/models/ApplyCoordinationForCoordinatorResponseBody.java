// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForCoordinatorResponseBody extends TeaModel {
    @NameInMap("CoordinateFlowModels")
    public java.util.List<ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels> coordinateFlowModels;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyCoordinationForCoordinatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForCoordinatorResponseBody self = new ApplyCoordinationForCoordinatorResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForCoordinatorResponseBody setCoordinateFlowModels(java.util.List<ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels> coordinateFlowModels) {
        this.coordinateFlowModels = coordinateFlowModels;
        return this;
    }
    public java.util.List<ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels> getCoordinateFlowModels() {
        return this.coordinateFlowModels;
    }

    public ApplyCoordinationForCoordinatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>co-9kt75fon9pj****</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        /**
         * <strong>example:</strong>
         * <p>W0Rlc2t0b3BdDQpHV1Rva2VuPTAwT1A1bHp1RUlEdU00T0IzemdiZ****</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <strong>example:</strong>
         * <p>10419178654***</p>
         */
        @NameInMap("CoordinatorUserId")
        public String coordinatorUserId;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>ai-ij4a6kd4bn2****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>test-resource</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels build(java.util.Map<String, ?> map) throws Exception {
            ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels self = new ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels();
            return TeaModel.build(map, self);
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setCoId(String coId) {
            this.coId = coId;
            return this;
        }
        public String getCoId() {
            return this.coId;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setCoordinateStatus(String coordinateStatus) {
            this.coordinateStatus = coordinateStatus;
            return this;
        }
        public String getCoordinateStatus() {
            return this.coordinateStatus;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setCoordinateTicket(String coordinateTicket) {
            this.coordinateTicket = coordinateTicket;
            return this;
        }
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setCoordinatorUserId(String coordinatorUserId) {
            this.coordinatorUserId = coordinatorUserId;
            return this;
        }
        public String getCoordinatorUserId() {
            return this.coordinatorUserId;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApplyCoordinationForCoordinatorResponseBodyCoordinateFlowModels setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
