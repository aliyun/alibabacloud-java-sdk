// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsAgentResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates a successful call. For non-200 values, the message field contains the error description.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The JSON-RPC 2.0 response body. data.result contains the actual return content of the called ACP method. data.id is the id passed in the request. data.jsonrpc is fixed to 2.0. data.timestamp is the UNIX timestamp in milliseconds when the response was generated.</p>
     */
    @NameInMap("data")
    public java.util.Map<String, String> data;

    /**
     * <p>The error description. The value is null when the call is successful. A specific error message is returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent subscription is inactive or expired</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1df6d614-96db-41bd-b8b6-ab061a1724ca</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InvokeEsAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsAgentResponseBody self = new InvokeEsAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeEsAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeEsAgentResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public InvokeEsAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeEsAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
