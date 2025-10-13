// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class GetCoordinationTicketResponseBody extends TeaModel {
    @NameInMap("CoordinateTicketModel")
    public GetCoordinationTicketResponseBodyCoordinateTicketModel coordinateTicketModel;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCoordinationTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinationTicketResponseBody self = new GetCoordinationTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCoordinationTicketResponseBody setCoordinateTicketModel(GetCoordinationTicketResponseBodyCoordinateTicketModel coordinateTicketModel) {
        this.coordinateTicketModel = coordinateTicketModel;
        return this;
    }
    public GetCoordinationTicketResponseBodyCoordinateTicketModel getCoordinateTicketModel() {
        return this.coordinateTicketModel;
    }

    public GetCoordinationTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCoordinationTicketResponseBodyCoordinateTicketModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>co-dk5xrhqlizm42****</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <strong>example:</strong>
         * <p>W0Rlc2t0b3BdDQpHV1Rva2VuPTAwT1A1bHp1RUlEdU00T0IzemdiZ****</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <strong>example:</strong>
         * <p>eab51156-7832-4922-9623-ff905****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetCoordinationTicketResponseBodyCoordinateTicketModel build(java.util.Map<String, ?> map) throws Exception {
            GetCoordinationTicketResponseBodyCoordinateTicketModel self = new GetCoordinationTicketResponseBodyCoordinateTicketModel();
            return TeaModel.build(map, self);
        }

        public GetCoordinationTicketResponseBodyCoordinateTicketModel setCoId(String coId) {
            this.coId = coId;
            return this;
        }
        public String getCoId() {
            return this.coId;
        }

        public GetCoordinationTicketResponseBodyCoordinateTicketModel setCoordinateTicket(String coordinateTicket) {
            this.coordinateTicket = coordinateTicket;
            return this;
        }
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        public GetCoordinationTicketResponseBodyCoordinateTicketModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetCoordinationTicketResponseBodyCoordinateTicketModel setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
