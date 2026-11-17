// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebFilterTemplateResponseBody body;

    public static UpdateWebFilterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterTemplateResponse self = new UpdateWebFilterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebFilterTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebFilterTemplateResponse setBody(UpdateWebFilterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebFilterTemplateResponseBody getBody() {
        return this.body;
    }

}
