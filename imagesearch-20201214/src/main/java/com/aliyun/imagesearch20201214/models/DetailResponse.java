// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetailResponseBody body;

    public static DetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailResponse self = new DetailResponse();
        return TeaModel.build(map, self);
    }

    public DetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetailResponse setBody(DetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailResponseBody getBody() {
        return this.body;
    }

}
