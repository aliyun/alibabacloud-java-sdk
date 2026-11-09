// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RebuildSandboxResponseBody extends TeaModel {
    /**
     * <p>Task result code of the API request. A successful request returns SUCCESS. Query task result of the asynchronous task separately.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The acceptance result of the rebuild request.</p>
     */
    @NameInMap("data")
    public RebuildSandboxResponseBodyData data;

    /**
     * <p>The HTTP status code of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result description of the API request. This does not indicate that the asynchronous rebuild task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. You can use the request ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1BE93-46A7-1A2A-BD62-159FCDAA****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API request is successful. A value of true does not indicate that the sandbox rebuild is complete.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RebuildSandboxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildSandboxResponseBody self = new RebuildSandboxResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildSandboxResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RebuildSandboxResponseBody setData(RebuildSandboxResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RebuildSandboxResponseBodyData getData() {
        return this.data;
    }

    public RebuildSandboxResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RebuildSandboxResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RebuildSandboxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildSandboxResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RebuildSandboxResponseBodyData extends TeaModel {
        /**
         * <p>The target instance incarnation for this rebuild. A rebuild increases the incarnation. The returned value only indicates that the request is accepted and does not indicate that the new instance is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("incarnation")
        public Long incarnation;

        /**
         * <p>The ID of the initial rebuild task. Use the operationId returned by RebuildSandbox. Always use this ID to query the overall result. You do not need to use the IDs of subsequently created tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1be92-7fa4-76b2-a871-b376d6d0****</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The logical sandbox ID that corresponds to this rebuild. The logical ID remains unchanged after the rebuild.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1b56a-b00f-7aa3-bacf-cc9d04b0****</p>
         */
        @NameInMap("sandboxId")
        public String sandboxId;

        public static RebuildSandboxResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RebuildSandboxResponseBodyData self = new RebuildSandboxResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RebuildSandboxResponseBodyData setIncarnation(Long incarnation) {
            this.incarnation = incarnation;
            return this;
        }
        public Long getIncarnation() {
            return this.incarnation;
        }

        public RebuildSandboxResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public RebuildSandboxResponseBodyData setSandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }
        public String getSandboxId() {
            return this.sandboxId;
        }

    }

}
