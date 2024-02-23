// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IvrCallResponseBody body;

    public static IvrCallResponse build(java.util.Map<String, ?> map) throws Exception {
        IvrCallResponse self = new IvrCallResponse();
        return TeaModel.build(map, self);
    }

    public IvrCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IvrCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IvrCallResponse setBody(IvrCallResponseBody body) {
        this.body = body;
        return this;
    }
    public IvrCallResponseBody getBody() {
        return this.body;
    }

}
