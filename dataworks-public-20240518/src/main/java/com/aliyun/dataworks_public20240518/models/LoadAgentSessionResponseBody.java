// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionResponseBody extends TeaModel {
    @NameInMap("Error")
    public Object error;

    /**
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    @NameInMap("Method")
    public String method;

    @NameInMap("Params")
    public Object params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0D41C608-0C60-5EB0-B986-1460909CF642</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Object result;

    /**
     * <strong>example:</strong>
     * <p>1769479322828</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static LoadAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadAgentSessionResponseBody self = new LoadAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadAgentSessionResponseBody setError(Object error) {
        this.error = error;
        return this;
    }
    public Object getError() {
        return this.error;
    }

    public LoadAgentSessionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LoadAgentSessionResponseBody setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public LoadAgentSessionResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public LoadAgentSessionResponseBody setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public LoadAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoadAgentSessionResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

    public LoadAgentSessionResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
