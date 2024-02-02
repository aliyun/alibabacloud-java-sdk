// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAgentStateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentStateLogsResponse setBody(ListAgentStateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentStateLogsResponseBody getBody() {
        return this.body;
    }

}
