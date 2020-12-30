// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveTemplateResponseBody body;

    public static ApproveTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveTemplateResponse self = new ApproveTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ApproveTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveTemplateResponse setBody(ApproveTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveTemplateResponseBody getBody() {
        return this.body;
    }

}
