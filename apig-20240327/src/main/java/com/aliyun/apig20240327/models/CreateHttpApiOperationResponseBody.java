// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiOperationResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Operation information.</p>
     */
    @NameInMap("data")
    public CreateHttpApiOperationResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateHttpApiOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiOperationResponseBody self = new CreateHttpApiOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHttpApiOperationResponseBody setData(CreateHttpApiOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHttpApiOperationResponseBodyData getData() {
        return this.data;
    }

    public CreateHttpApiOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHttpApiOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateHttpApiOperationResponseBodyDataOperations extends TeaModel {
        /**
         * <p>Operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-xxx</p>
         */
        @NameInMap("operationId")
        public String operationId;

        public static CreateHttpApiOperationResponseBodyDataOperations build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiOperationResponseBodyDataOperations self = new CreateHttpApiOperationResponseBodyDataOperations();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiOperationResponseBodyDataOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class CreateHttpApiOperationResponseBodyData extends TeaModel {
        /**
         * <p>Operation information.</p>
         */
        @NameInMap("operations")
        public java.util.List<CreateHttpApiOperationResponseBodyDataOperations> operations;

        public static CreateHttpApiOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiOperationResponseBodyData self = new CreateHttpApiOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiOperationResponseBodyData setOperations(java.util.List<CreateHttpApiOperationResponseBodyDataOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<CreateHttpApiOperationResponseBodyDataOperations> getOperations() {
            return this.operations;
        }

    }

}
