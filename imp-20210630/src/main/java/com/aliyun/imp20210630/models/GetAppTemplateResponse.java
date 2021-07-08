// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppTemplateResponseBody body;

    public static GetAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateResponse self = new GetAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppTemplateResponse setBody(GetAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppTemplateResponseBody getBody() {
        return this.body;
    }

}
