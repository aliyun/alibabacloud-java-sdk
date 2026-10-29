// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class CreateSdnsRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSdnsRuleCategoryResponseBody body;

    public static CreateSdnsRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSdnsRuleCategoryResponse self = new CreateSdnsRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateSdnsRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSdnsRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSdnsRuleCategoryResponse setBody(CreateSdnsRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSdnsRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
