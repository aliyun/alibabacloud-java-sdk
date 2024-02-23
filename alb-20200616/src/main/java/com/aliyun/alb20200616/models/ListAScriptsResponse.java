// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAScriptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAScriptsResponseBody body;

    public static ListAScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAScriptsResponse self = new ListAScriptsResponse();
        return TeaModel.build(map, self);
    }

    public ListAScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAScriptsResponse setBody(ListAScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAScriptsResponseBody getBody() {
        return this.body;
    }

}
