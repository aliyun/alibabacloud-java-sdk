// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RenderServicesByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenderServicesByTemplateResponseBody body;

    public static RenderServicesByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderServicesByTemplateResponse self = new RenderServicesByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RenderServicesByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderServicesByTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderServicesByTemplateResponse setBody(RenderServicesByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RenderServicesByTemplateResponseBody getBody() {
        return this.body;
    }

}
