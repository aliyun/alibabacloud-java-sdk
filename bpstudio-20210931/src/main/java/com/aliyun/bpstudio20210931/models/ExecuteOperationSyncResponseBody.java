// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationSyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>op_xxxxxxxxxxxxxxxxxx_dds_modifyInstanceType_BYSOQGWUV6PME412_ERMEZLXNN3K9N3OL</p>
     */
    @NameInMap("Data")
    public ExecuteOperationSyncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Access key ID cannot be null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FDC73B05-5331-57AA-BA93-4C9882792FF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteOperationSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationSyncResponseBody self = new ExecuteOperationSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationSyncResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteOperationSyncResponseBody setData(ExecuteOperationSyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteOperationSyncResponseBodyData getData() {
        return this.data;
    }

    public ExecuteOperationSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteOperationSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteOperationSyncResponseBodyData extends TeaModel {
        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("Message")
        public String message;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("Status")
        public String status;

        public static ExecuteOperationSyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteOperationSyncResponseBodyData self = new ExecuteOperationSyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteOperationSyncResponseBodyData setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public ExecuteOperationSyncResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecuteOperationSyncResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ExecuteOperationSyncResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
