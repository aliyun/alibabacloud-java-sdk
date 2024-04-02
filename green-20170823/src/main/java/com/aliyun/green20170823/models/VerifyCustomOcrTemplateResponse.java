// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyCustomOcrTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyCustomOcrTemplateResponseBody body;

    public static VerifyCustomOcrTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomOcrTemplateResponse self = new VerifyCustomOcrTemplateResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCustomOcrTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCustomOcrTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCustomOcrTemplateResponse setBody(VerifyCustomOcrTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCustomOcrTemplateResponseBody getBody() {
        return this.body;
    }

}
