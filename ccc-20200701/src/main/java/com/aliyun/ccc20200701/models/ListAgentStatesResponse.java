// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAgentStatesResponse setBody(ListAgentStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentStatesResponseBody getBody() {
        return this.body;
    }

}
