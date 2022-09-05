// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateIntlImageByTemplateResponseBody body;

    public static CreateOrUpdateIntlImageByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageByTemplateResponse self = new CreateOrUpdateIntlImageByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateIntlImageByTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateIntlImageByTemplateResponse setBody(CreateOrUpdateIntlImageByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateIntlImageByTemplateResponseBody getBody() {
        return this.body;
    }

}
