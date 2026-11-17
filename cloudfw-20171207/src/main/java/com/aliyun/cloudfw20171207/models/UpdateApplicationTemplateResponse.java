// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationTemplateResponseBody body;

    public static UpdateApplicationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTemplateResponse self = new UpdateApplicationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationTemplateResponse setBody(UpdateApplicationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationTemplateResponseBody getBody() {
        return this.body;
    }

}
