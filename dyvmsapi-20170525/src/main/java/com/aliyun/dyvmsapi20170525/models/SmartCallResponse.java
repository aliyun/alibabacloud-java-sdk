// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmartCallResponseBody body;

    public static SmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartCallResponse self = new SmartCallResponse();
        return TeaModel.build(map, self);
    }

    public SmartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmartCallResponse setBody(SmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartCallResponseBody getBody() {
        return this.body;
    }

}
