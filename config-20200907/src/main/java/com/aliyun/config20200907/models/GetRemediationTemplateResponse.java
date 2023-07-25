// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetRemediationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRemediationTemplateResponseBody body;

    public static GetRemediationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemediationTemplateResponse self = new GetRemediationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetRemediationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRemediationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRemediationTemplateResponse setBody(GetRemediationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRemediationTemplateResponseBody getBody() {
        return this.body;
    }

}
