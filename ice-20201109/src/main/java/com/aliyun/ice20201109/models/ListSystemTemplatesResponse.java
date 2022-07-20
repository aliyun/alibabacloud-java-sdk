// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSystemTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemTemplatesResponseBody body;

    public static ListSystemTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemTemplatesResponse self = new ListSystemTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemTemplatesResponse setBody(ListSystemTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemTemplatesResponseBody getBody() {
        return this.body;
    }

}
