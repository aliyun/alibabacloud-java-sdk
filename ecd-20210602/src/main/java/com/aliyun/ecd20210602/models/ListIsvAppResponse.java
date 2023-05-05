// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListIsvAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIsvAppResponseBody body;

    public static ListIsvAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsvAppResponse self = new ListIsvAppResponse();
        return TeaModel.build(map, self);
    }

    public ListIsvAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsvAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIsvAppResponse setBody(ListIsvAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsvAppResponseBody getBody() {
        return this.body;
    }

}
