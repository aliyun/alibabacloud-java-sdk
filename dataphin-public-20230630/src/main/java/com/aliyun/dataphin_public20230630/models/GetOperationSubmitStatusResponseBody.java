// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationSubmitStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("OperationSubmitJob")
    public GetOperationSubmitStatusResponseBodyOperationSubmitJob operationSubmitJob;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOperationSubmitStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationSubmitStatusResponseBody self = new GetOperationSubmitStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationSubmitStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperationSubmitStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOperationSubmitStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOperationSubmitStatusResponseBody setOperationSubmitJob(GetOperationSubmitStatusResponseBodyOperationSubmitJob operationSubmitJob) {
        this.operationSubmitJob = operationSubmitJob;
        return this;
    }
    public GetOperationSubmitStatusResponseBodyOperationSubmitJob getOperationSubmitJob() {
        return this.operationSubmitJob;
    }

    public GetOperationSubmitStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationSubmitStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOperationSubmitStatusResponseBodyOperationSubmitJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f_122_232342</p>
         */
        @NameInMap("ExternalBizId")
        public String externalBizId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>SUPPLY_DATA</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("OperationStatus")
        public String operationStatus;

        /**
         * <strong>example:</strong>
         * <p>132344</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public String progress;

        public static GetOperationSubmitStatusResponseBodyOperationSubmitJob build(java.util.Map<String, ?> map) throws Exception {
            GetOperationSubmitStatusResponseBodyOperationSubmitJob self = new GetOperationSubmitStatusResponseBodyOperationSubmitJob();
            return TeaModel.build(map, self);
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setExternalBizId(String externalBizId) {
            this.externalBizId = externalBizId;
            return this;
        }
        public String getExternalBizId() {
            return this.externalBizId;
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetOperationSubmitStatusResponseBodyOperationSubmitJob setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
