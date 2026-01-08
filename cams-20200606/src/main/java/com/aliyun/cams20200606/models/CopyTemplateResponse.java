// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CopyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyTemplateResponseBody body;

    public static CopyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyTemplateResponse self = new CopyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CopyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyTemplateResponse setBody(CopyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyTemplateResponseBody getBody() {
        return this.body;
    }

}
