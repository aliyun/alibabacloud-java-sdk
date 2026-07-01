// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordRunCodeResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The operation log code response.</p>
     */
    @NameInMap("OperationLogCodeResponse")
    public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse operationLogCodeResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOperationRecordRunCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordRunCodeResponseBody self = new GetOperationRecordRunCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordRunCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperationRecordRunCodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOperationRecordRunCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOperationRecordRunCodeResponseBody setOperationLogCodeResponse(GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse operationLogCodeResponse) {
        this.operationLogCodeResponse = operationLogCodeResponse;
        return this;
    }
    public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse getOperationLogCodeResponse() {
        return this.operationLogCodeResponse;
    }

    public GetOperationRecordRunCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationRecordRunCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse extends TeaModel {
        /**
         * <p>The code content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM test_table WHERE id = 1;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OperatorId")
        public Integer operatorId;

        /**
         * <p>The operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL查询节点</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlNum")
        public Integer sqlNum;

        public static GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse self = new GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse setOperatorId(Integer operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public Integer getOperatorId() {
            return this.operatorId;
        }

        public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetOperationRecordRunCodeResponseBodyOperationLogCodeResponse setSqlNum(Integer sqlNum) {
            this.sqlNum = sqlNum;
            return this;
        }
        public Integer getSqlNum() {
            return this.sqlNum;
        }

    }

}
