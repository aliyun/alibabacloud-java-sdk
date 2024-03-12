// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneCntResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterveneCntResponseBody body;

    public static ListInterveneCntResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneCntResponse self = new ListInterveneCntResponse();
        return TeaModel.build(map, self);
    }

    public ListInterveneCntResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterveneCntResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterveneCntResponse setBody(ListInterveneCntResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterveneCntResponseBody getBody() {
        return this.body;
    }

}
