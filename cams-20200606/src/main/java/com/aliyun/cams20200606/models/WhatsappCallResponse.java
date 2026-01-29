// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WhatsappCallResponseBody body;

    public static WhatsappCallResponse build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallResponse self = new WhatsappCallResponse();
        return TeaModel.build(map, self);
    }

    public WhatsappCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WhatsappCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WhatsappCallResponse setBody(WhatsappCallResponseBody body) {
        this.body = body;
        return this;
    }
    public WhatsappCallResponseBody getBody() {
        return this.body;
    }

}
