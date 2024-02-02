// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MakeCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MakeCallResponseBody body;

    public static MakeCallResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeCallResponse self = new MakeCallResponse();
        return TeaModel.build(map, self);
    }

    public MakeCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MakeCallResponse setBody(MakeCallResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeCallResponseBody getBody() {
        return this.body;
    }

}
