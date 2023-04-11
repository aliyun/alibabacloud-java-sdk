// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAuthorityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAuthorityTemplateResponseBody body;

    public static UpdateAuthorityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorityTemplateResponse self = new UpdateAuthorityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorityTemplateResponse setBody(UpdateAuthorityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

}
