// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendSystemPropertyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSystemPropertyTemplateResponseBody body;

    public static SendSystemPropertyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSystemPropertyTemplateResponse self = new SendSystemPropertyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SendSystemPropertyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSystemPropertyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSystemPropertyTemplateResponse setBody(SendSystemPropertyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSystemPropertyTemplateResponseBody getBody() {
        return this.body;
    }

}
