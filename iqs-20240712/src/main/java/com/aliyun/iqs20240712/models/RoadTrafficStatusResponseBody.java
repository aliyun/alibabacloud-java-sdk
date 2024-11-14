// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RoadTrafficStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<RoadTrafficStatusResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>504 gateway error</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RoadTrafficStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RoadTrafficStatusResponseBody self = new RoadTrafficStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public RoadTrafficStatusResponseBody setData(java.util.List<RoadTrafficStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RoadTrafficStatusResponseBodyData> getData() {
        return this.data;
    }

    public RoadTrafficStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RoadTrafficStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RoadTrafficStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RoadTrafficStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RoadTrafficStatusResponseBodyDataEvaluation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("blockedPercentage")
        public String blockedPercentage;

        /**
         * <strong>example:</strong>
         * <p>100.00%</p>
         */
        @NameInMap("clearPercentage")
        public String clearPercentage;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("heavyPercentage")
        public String heavyPercentage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("unknownPercentage")
        public String unknownPercentage;

        public static RoadTrafficStatusResponseBodyDataEvaluation build(java.util.Map<String, ?> map) throws Exception {
            RoadTrafficStatusResponseBodyDataEvaluation self = new RoadTrafficStatusResponseBodyDataEvaluation();
            return TeaModel.build(map, self);
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setBlockedPercentage(String blockedPercentage) {
            this.blockedPercentage = blockedPercentage;
            return this;
        }
        public String getBlockedPercentage() {
            return this.blockedPercentage;
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setClearPercentage(String clearPercentage) {
            this.clearPercentage = clearPercentage;
            return this;
        }
        public String getClearPercentage() {
            return this.clearPercentage;
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setHeavyPercentage(String heavyPercentage) {
            this.heavyPercentage = heavyPercentage;
            return this;
        }
        public String getHeavyPercentage() {
            return this.heavyPercentage;
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RoadTrafficStatusResponseBodyDataEvaluation setUnknownPercentage(String unknownPercentage) {
            this.unknownPercentage = unknownPercentage;
            return this;
        }
        public String getUnknownPercentage() {
            return this.unknownPercentage;
        }

    }

    public static class RoadTrafficStatusResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("evaluation")
        public RoadTrafficStatusResponseBodyDataEvaluation evaluation;

        public static RoadTrafficStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RoadTrafficStatusResponseBodyData self = new RoadTrafficStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RoadTrafficStatusResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RoadTrafficStatusResponseBodyData setEvaluation(RoadTrafficStatusResponseBodyDataEvaluation evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public RoadTrafficStatusResponseBodyDataEvaluation getEvaluation() {
            return this.evaluation;
        }

    }

}
