// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescTemplateResponseBody body;

    public static DescTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescTemplateResponse self = new DescTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescTemplateResponse setBody(DescTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescTemplateResponseBody getBody() {
        return this.body;
    }

}
