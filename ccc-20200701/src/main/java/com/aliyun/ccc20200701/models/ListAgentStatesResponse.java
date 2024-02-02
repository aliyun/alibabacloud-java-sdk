// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentStatesResponseBody body;

    public static ListAgentStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStatesResponse self = new ListAgentStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentStatesResponse setBody(ListAgentStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentStatesResponseBody getBody() {
        return this.body;
    }

}
