// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubResponseBody body;

    public static ListSubResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubResponse self = new ListSubResponse();
        return TeaModel.build(map, self);
    }

    public ListSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubResponse setBody(ListSubResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubResponseBody getBody() {
        return this.body;
    }

}
