// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentStateLogsResponseBody body;

    public static ListAgentStateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStateLogsResponse self = new ListAgentStateLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentStateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentStateLogsResponse setBody(ListAgentStateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentStateLogsResponseBody getBody() {
        return this.body;
    }

}
