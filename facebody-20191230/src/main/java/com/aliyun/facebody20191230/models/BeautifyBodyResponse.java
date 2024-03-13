// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BeautifyBodyResponseBody body;

    public static BeautifyBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyResponse self = new BeautifyBodyResponse();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeautifyBodyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeautifyBodyResponse setBody(BeautifyBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public BeautifyBodyResponseBody getBody() {
        return this.body;
    }

}
