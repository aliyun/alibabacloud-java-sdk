// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SelectTagResourceNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectTagResourceNewResponseBody body;

    public static SelectTagResourceNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectTagResourceNewResponse self = new SelectTagResourceNewResponse();
        return TeaModel.build(map, self);
    }

    public SelectTagResourceNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectTagResourceNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectTagResourceNewResponse setBody(SelectTagResourceNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectTagResourceNewResponseBody getBody() {
        return this.body;
    }

}
