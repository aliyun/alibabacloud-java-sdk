// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListIndexTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIndexTemplatesResponseBody body;

    public static ListIndexTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexTemplatesResponse self = new ListIndexTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexTemplatesResponse setBody(ListIndexTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexTemplatesResponseBody getBody() {
        return this.body;
    }

}
