// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RectangleTrafficStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<RectangleTrafficStatusResponseBodyData> data;

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
     * <p>78032F8B-0157-53F9-B1A8-3BD86ADE38D0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RectangleTrafficStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RectangleTrafficStatusResponseBody self = new RectangleTrafficStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public RectangleTrafficStatusResponseBody setData(java.util.List<RectangleTrafficStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RectangleTrafficStatusResponseBodyData> getData() {
        return this.data;
    }

    public RectangleTrafficStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RectangleTrafficStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RectangleTrafficStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RectangleTrafficStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RectangleTrafficStatusResponseBodyDataEvaluation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("blockedPercentage")
        public String blockedPercentage;

        /**
         * <strong>example:</strong>
         * <p>30.77%</p>
         */
        @NameInMap("clearPercentage")
        public String clearPercentage;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>7.59%</p>
         */
        @NameInMap("heavyPercentage")
        public String heavyPercentage;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>61.45%</p>
         */
        @NameInMap("unknownPercentage")
        public String unknownPercentage;

        public static RectangleTrafficStatusResponseBodyDataEvaluation build(java.util.Map<String, ?> map) throws Exception {
            RectangleTrafficStatusResponseBodyDataEvaluation self = new RectangleTrafficStatusResponseBodyDataEvaluation();
            return TeaModel.build(map, self);
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setBlockedPercentage(String blockedPercentage) {
            this.blockedPercentage = blockedPercentage;
            return this;
        }
        public String getBlockedPercentage() {
            return this.blockedPercentage;
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setClearPercentage(String clearPercentage) {
            this.clearPercentage = clearPercentage;
            return this;
        }
        public String getClearPercentage() {
            return this.clearPercentage;
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setHeavyPercentage(String heavyPercentage) {
            this.heavyPercentage = heavyPercentage;
            return this;
        }
        public String getHeavyPercentage() {
            return this.heavyPercentage;
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RectangleTrafficStatusResponseBodyDataEvaluation setUnknownPercentage(String unknownPercentage) {
            this.unknownPercentage = unknownPercentage;
            return this;
        }
        public String getUnknownPercentage() {
            return this.unknownPercentage;
        }

    }

    public static class RectangleTrafficStatusResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("evaluation")
        public RectangleTrafficStatusResponseBodyDataEvaluation evaluation;

        public static RectangleTrafficStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RectangleTrafficStatusResponseBodyData self = new RectangleTrafficStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RectangleTrafficStatusResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RectangleTrafficStatusResponseBodyData setEvaluation(RectangleTrafficStatusResponseBodyDataEvaluation evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public RectangleTrafficStatusResponseBodyDataEvaluation getEvaluation() {
            return this.evaluation;
        }

    }

}
