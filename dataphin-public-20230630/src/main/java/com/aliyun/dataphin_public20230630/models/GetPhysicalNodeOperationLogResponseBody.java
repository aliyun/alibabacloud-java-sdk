// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeOperationLogResponseBody extends TeaModel {
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

    @NameInMap("OperationLogList")
    public java.util.List<GetPhysicalNodeOperationLogResponseBodyOperationLogList> operationLogList;

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

    public static GetPhysicalNodeOperationLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeOperationLogResponseBody self = new GetPhysicalNodeOperationLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeOperationLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalNodeOperationLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalNodeOperationLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalNodeOperationLogResponseBody setOperationLogList(java.util.List<GetPhysicalNodeOperationLogResponseBodyOperationLogList> operationLogList) {
        this.operationLogList = operationLogList;
        return this;
    }
    public java.util.List<GetPhysicalNodeOperationLogResponseBodyOperationLogList> getOperationLogList() {
        return this.operationLogList;
    }

    public GetPhysicalNodeOperationLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalNodeOperationLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalNodeOperationLogResponseBodyOperationLogList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <strong>example:</strong>
         * <p>PAUSE_TASK</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <strong>example:</strong>
         * <p>132222</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("OperatorName")
        public String operatorName;

        public static GetPhysicalNodeOperationLogResponseBodyOperationLogList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeOperationLogResponseBodyOperationLogList self = new GetPhysicalNodeOperationLogResponseBodyOperationLogList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeOperationLogResponseBodyOperationLogList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetPhysicalNodeOperationLogResponseBodyOperationLogList setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public GetPhysicalNodeOperationLogResponseBodyOperationLogList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetPhysicalNodeOperationLogResponseBodyOperationLogList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetPhysicalNodeOperationLogResponseBodyOperationLogList setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

}
