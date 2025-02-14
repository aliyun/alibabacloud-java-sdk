// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIAgentDialoguesResponseBody body;

    public static ListAIAgentDialoguesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentDialoguesResponse self = new ListAIAgentDialoguesResponse();
        return TeaModel.build(map, self);
    }

    public ListAIAgentDialoguesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIAgentDialoguesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIAgentDialoguesResponse setBody(ListAIAgentDialoguesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIAgentDialoguesResponseBody getBody() {
        return this.body;
    }

}
