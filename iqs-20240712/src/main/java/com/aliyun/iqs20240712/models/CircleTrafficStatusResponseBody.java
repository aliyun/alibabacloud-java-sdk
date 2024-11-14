// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CircleTrafficStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<CircleTrafficStatusResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Access was denied</p>
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

    public static CircleTrafficStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CircleTrafficStatusResponseBody self = new CircleTrafficStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CircleTrafficStatusResponseBody setData(java.util.List<CircleTrafficStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CircleTrafficStatusResponseBodyData> getData() {
        return this.data;
    }

    public CircleTrafficStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CircleTrafficStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CircleTrafficStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CircleTrafficStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CircleTrafficStatusResponseBodyDataEvaluation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("blockedPercentage")
        public String blockedPercentage;

        /**
         * <strong>example:</strong>
         * <p>54.55%</p>
         */
        @NameInMap("clearPercentage")
        public String clearPercentage;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>18.18%</p>
         */
        @NameInMap("heavyPercentage")
        public String heavyPercentage;

        /**
         * <strong>example:</strong>
         * <p>RUNNING_EXECUTION</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>27.27%</p>
         */
        @NameInMap("unknownPercentage")
        public String unknownPercentage;

        public static CircleTrafficStatusResponseBodyDataEvaluation build(java.util.Map<String, ?> map) throws Exception {
            CircleTrafficStatusResponseBodyDataEvaluation self = new CircleTrafficStatusResponseBodyDataEvaluation();
            return TeaModel.build(map, self);
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setBlockedPercentage(String blockedPercentage) {
            this.blockedPercentage = blockedPercentage;
            return this;
        }
        public String getBlockedPercentage() {
            return this.blockedPercentage;
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setClearPercentage(String clearPercentage) {
            this.clearPercentage = clearPercentage;
            return this;
        }
        public String getClearPercentage() {
            return this.clearPercentage;
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setHeavyPercentage(String heavyPercentage) {
            this.heavyPercentage = heavyPercentage;
            return this;
        }
        public String getHeavyPercentage() {
            return this.heavyPercentage;
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CircleTrafficStatusResponseBodyDataEvaluation setUnknownPercentage(String unknownPercentage) {
            this.unknownPercentage = unknownPercentage;
            return this;
        }
        public String getUnknownPercentage() {
            return this.unknownPercentage;
        }

    }

    public static class CircleTrafficStatusResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("evaluation")
        public CircleTrafficStatusResponseBodyDataEvaluation evaluation;

        public static CircleTrafficStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CircleTrafficStatusResponseBodyData self = new CircleTrafficStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CircleTrafficStatusResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CircleTrafficStatusResponseBodyData setEvaluation(CircleTrafficStatusResponseBodyDataEvaluation evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public CircleTrafficStatusResponseBodyDataEvaluation getEvaluation() {
            return this.evaluation;
        }

    }

}
