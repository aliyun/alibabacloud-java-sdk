// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMcpResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the deletion status is updated. A value of true indicates that at least one matching record has been logically deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The return code. The value success is returned for a successful request. An error code is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when a system-level request failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready MCP Servers not found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate this call.</p>
     * 
     * <strong>example:</strong>
     * <p>550e84***44</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataAgentMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMcpResponseBody self = new DeleteDataAgentMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMcpResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DeleteDataAgentMcpResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteDataAgentMcpResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDataAgentMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataAgentMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
