// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRealTimeAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRealTimeAgentResponseBody body;

    public static ListRealTimeAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealTimeAgentResponse self = new ListRealTimeAgentResponse();
        return TeaModel.build(map, self);
    }

    public ListRealTimeAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealTimeAgentResponse setBody(ListRealTimeAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealTimeAgentResponseBody getBody() {
        return this.body;
    }

}
