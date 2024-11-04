// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindXBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindXBResponseBody body;

    public static BindXBResponse build(java.util.Map<String, ?> map) throws Exception {
        BindXBResponse self = new BindXBResponse();
        return TeaModel.build(map, self);
    }

    public BindXBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindXBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindXBResponse setBody(BindXBResponseBody body) {
        this.body = body;
        return this;
    }
    public BindXBResponseBody getBody() {
        return this.body;
    }

}
