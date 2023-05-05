// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListImageAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListImageAppResponseBody body;

    public static ListImageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageAppResponse self = new ListImageAppResponse();
        return TeaModel.build(map, self);
    }

    public ListImageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageAppResponse setBody(ListImageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageAppResponseBody getBody() {
        return this.body;
    }

}
