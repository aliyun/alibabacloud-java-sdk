// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindAXBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnBindAXBResponseBody body;

    public static UnBindAXBResponse build(java.util.Map<String, ?> map) throws Exception {
        UnBindAXBResponse self = new UnBindAXBResponse();
        return TeaModel.build(map, self);
    }

    public UnBindAXBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnBindAXBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnBindAXBResponse setBody(UnBindAXBResponseBody body) {
        this.body = body;
        return this;
    }
    public UnBindAXBResponseBody getBody() {
        return this.body;
    }

}
