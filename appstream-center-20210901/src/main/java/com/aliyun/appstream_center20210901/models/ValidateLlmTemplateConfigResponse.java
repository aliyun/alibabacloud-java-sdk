// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ValidateLlmTemplateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateLlmTemplateConfigResponseBody body;

    public static ValidateLlmTemplateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateLlmTemplateConfigResponse self = new ValidateLlmTemplateConfigResponse();
        return TeaModel.build(map, self);
    }

    public ValidateLlmTemplateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateLlmTemplateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateLlmTemplateConfigResponse setBody(ValidateLlmTemplateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateLlmTemplateConfigResponseBody getBody() {
        return this.body;
    }

}
