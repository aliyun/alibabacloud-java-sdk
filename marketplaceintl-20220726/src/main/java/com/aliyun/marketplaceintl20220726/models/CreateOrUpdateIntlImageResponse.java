// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateIntlImageResponseBody body;

    public static CreateOrUpdateIntlImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageResponse self = new CreateOrUpdateIntlImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateIntlImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateIntlImageResponse setBody(CreateOrUpdateIntlImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateIntlImageResponseBody getBody() {
        return this.body;
    }

}
