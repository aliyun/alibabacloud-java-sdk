// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAuthorityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthorityTemplateResponseBody body;

    public static CreateAuthorityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorityTemplateResponse self = new CreateAuthorityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorityTemplateResponse setBody(CreateAuthorityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

}
