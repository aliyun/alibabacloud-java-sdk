// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIndexTemplateResponseBody body;

    public static UpdateIndexTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexTemplateResponse self = new UpdateIndexTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIndexTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIndexTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIndexTemplateResponse setBody(UpdateIndexTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIndexTemplateResponseBody getBody() {
        return this.body;
    }

}
