// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentSessionResponseBody body;

    public static ListDataAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSessionResponse self = new ListDataAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentSessionResponse setBody(ListDataAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentSessionResponseBody getBody() {
        return this.body;
    }

}
