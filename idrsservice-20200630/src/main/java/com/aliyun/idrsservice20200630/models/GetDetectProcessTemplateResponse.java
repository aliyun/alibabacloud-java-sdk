// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectProcessTemplateResponseBody body;

    public static GetDetectProcessTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessTemplateResponse self = new GetDetectProcessTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectProcessTemplateResponse setBody(GetDetectProcessTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectProcessTemplateResponseBody getBody() {
        return this.body;
    }

}
