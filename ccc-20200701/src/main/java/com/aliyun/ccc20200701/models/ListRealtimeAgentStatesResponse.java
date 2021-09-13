// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRealtimeAgentStatesResponseBody body;

    public static ListRealtimeAgentStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeAgentStatesResponse self = new ListRealtimeAgentStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeAgentStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeAgentStatesResponse setBody(ListRealtimeAgentStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeAgentStatesResponseBody getBody() {
        return this.body;
    }

}
