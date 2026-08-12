// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAIAgentEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIAgentEventResponseBody body;

    public static ListAIAgentEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentEventResponse self = new ListAIAgentEventResponse();
        return TeaModel.build(map, self);
    }

    public ListAIAgentEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIAgentEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIAgentEventResponse setBody(ListAIAgentEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIAgentEventResponseBody getBody() {
        return this.body;
    }

}
