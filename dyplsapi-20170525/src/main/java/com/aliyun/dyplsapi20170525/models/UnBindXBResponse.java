// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindXBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnBindXBResponseBody body;

    public static UnBindXBResponse build(java.util.Map<String, ?> map) throws Exception {
        UnBindXBResponse self = new UnBindXBResponse();
        return TeaModel.build(map, self);
    }

    public UnBindXBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnBindXBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnBindXBResponse setBody(UnBindXBResponseBody body) {
        this.body = body;
        return this;
    }
    public UnBindXBResponseBody getBody() {
        return this.body;
    }

}
