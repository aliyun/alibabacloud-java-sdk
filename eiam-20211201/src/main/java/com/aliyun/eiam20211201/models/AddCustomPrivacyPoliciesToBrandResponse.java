// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddCustomPrivacyPoliciesToBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomPrivacyPoliciesToBrandResponseBody body;

    public static AddCustomPrivacyPoliciesToBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomPrivacyPoliciesToBrandResponse self = new AddCustomPrivacyPoliciesToBrandResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomPrivacyPoliciesToBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomPrivacyPoliciesToBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomPrivacyPoliciesToBrandResponse setBody(AddCustomPrivacyPoliciesToBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomPrivacyPoliciesToBrandResponseBody getBody() {
        return this.body;
    }

}
