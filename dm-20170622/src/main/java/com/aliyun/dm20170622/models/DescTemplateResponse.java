// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class DescTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescTemplateResponse setBody(DescTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescTemplateResponseBody getBody() {
        return this.body;
    }

}
