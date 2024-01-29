// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultCustomTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultCustomTemplateResponseBody body;

    public static SetDefaultCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultCustomTemplateResponse self = new SetDefaultCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultCustomTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultCustomTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultCustomTemplateResponse setBody(SetDefaultCustomTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultCustomTemplateResponseBody getBody() {
        return this.body;
    }

}
