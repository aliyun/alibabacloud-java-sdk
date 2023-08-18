// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeResponseBody body;

    public static ListNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeResponse self = new ListNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeResponse setBody(ListNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeResponseBody getBody() {
        return this.body;
    }

}
