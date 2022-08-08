// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class AddIntlImageProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddIntlImageProductVersionResponseBody body;

    public static AddIntlImageProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIntlImageProductVersionResponse self = new AddIntlImageProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public AddIntlImageProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIntlImageProductVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIntlImageProductVersionResponse setBody(AddIntlImageProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIntlImageProductVersionResponseBody getBody() {
        return this.body;
    }

}
