// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureOrderPayResponseBody body;

    public static InsureOrderPayResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderPayResponse self = new InsureOrderPayResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderPayResponse setBody(InsureOrderPayResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderPayResponseBody getBody() {
        return this.body;
    }

}
