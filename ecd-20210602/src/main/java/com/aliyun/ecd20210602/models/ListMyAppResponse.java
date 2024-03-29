// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListMyAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMyAppResponseBody body;

    public static ListMyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyAppResponse self = new ListMyAppResponse();
        return TeaModel.build(map, self);
    }

    public ListMyAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyAppResponse setBody(ListMyAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyAppResponseBody getBody() {
        return this.body;
    }

}
