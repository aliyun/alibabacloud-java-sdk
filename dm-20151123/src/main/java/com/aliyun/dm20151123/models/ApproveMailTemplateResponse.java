// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveMailTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveMailTemplateResponseBody body;

    public static ApproveMailTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveMailTemplateResponse self = new ApproveMailTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ApproveMailTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveMailTemplateResponse setBody(ApproveMailTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveMailTemplateResponseBody getBody() {
        return this.body;
    }

}
