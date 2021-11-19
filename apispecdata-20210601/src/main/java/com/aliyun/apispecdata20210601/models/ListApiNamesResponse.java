// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListApiNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApiNamesResponseBody body;

    public static ListApiNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiNamesResponse self = new ListApiNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListApiNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiNamesResponse setBody(ListApiNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiNamesResponseBody getBody() {
        return this.body;
    }

}
