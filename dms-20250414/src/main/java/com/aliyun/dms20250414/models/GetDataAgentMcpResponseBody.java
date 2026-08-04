// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentMcpResponseBody extends TeaModel {
    /**
     * <p>The MCP Server details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;uuid&quot;:&quot;	44lg<em><strong>z65&quot;,&quot;name&quot;:&quot;mcp&quot;,&quot;workspaceUuid&quot;:&quot;	atvx</strong></em>xmz&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;,&quot;netType&quot;:&quot;public&quot;,&quot;transportType&quot;:&quot;sse&quot;,&quot;state&quot;:&quot;ready&quot;,&quot;enable&quot;:true}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The return code. The value success is returned if the request was successful. An error code is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that describes the reason for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource Not exist,Mcp Server you provide is not exist</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate this call.</p>
     * 
     * <strong>example:</strong>
     * <p>550e***000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAgentMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentMcpResponseBody self = new GetDataAgentMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentMcpResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetDataAgentMcpResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentMcpResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
