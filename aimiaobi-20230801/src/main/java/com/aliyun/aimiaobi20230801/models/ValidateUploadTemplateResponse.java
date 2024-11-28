// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ValidateUploadTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateUploadTemplateResponseBody body;

    public static ValidateUploadTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateUploadTemplateResponse self = new ValidateUploadTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ValidateUploadTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateUploadTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateUploadTemplateResponse setBody(ValidateUploadTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateUploadTemplateResponseBody getBody() {
        return this.body;
    }

}
