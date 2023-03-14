// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetExecuteOperationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Status</p>
     */
    @NameInMap("Data")
    public GetExecuteOperationResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetExecuteOperationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteOperationResultResponseBody self = new GetExecuteOperationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecuteOperationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExecuteOperationResultResponseBody setData(GetExecuteOperationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExecuteOperationResultResponseBodyData getData() {
        return this.data;
    }

    public GetExecuteOperationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExecuteOperationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExecuteOperationResultResponseBodyData extends TeaModel {
        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("Message")
        public String message;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("Status")
        public String status;

        public static GetExecuteOperationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExecuteOperationResultResponseBodyData self = new GetExecuteOperationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExecuteOperationResultResponseBodyData setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public GetExecuteOperationResultResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetExecuteOperationResultResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetExecuteOperationResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
