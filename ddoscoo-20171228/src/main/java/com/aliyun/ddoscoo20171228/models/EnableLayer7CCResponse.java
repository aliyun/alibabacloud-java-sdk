// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EnableLayer7CCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableLayer7CCResponseBody body;

    public static EnableLayer7CCResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLayer7CCResponse self = new EnableLayer7CCResponse();
        return TeaModel.build(map, self);
    }

    public EnableLayer7CCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLayer7CCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableLayer7CCResponse setBody(EnableLayer7CCResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLayer7CCResponseBody getBody() {
        return this.body;
    }

}
