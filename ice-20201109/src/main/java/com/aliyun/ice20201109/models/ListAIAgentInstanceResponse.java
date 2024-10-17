// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIAgentInstanceResponseBody body;

    public static ListAIAgentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentInstanceResponse self = new ListAIAgentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListAIAgentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIAgentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIAgentInstanceResponse setBody(ListAIAgentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIAgentInstanceResponseBody getBody() {
        return this.body;
    }

}
