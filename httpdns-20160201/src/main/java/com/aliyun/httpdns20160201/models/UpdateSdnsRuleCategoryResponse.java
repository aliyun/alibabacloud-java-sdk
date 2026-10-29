// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class UpdateSdnsRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSdnsRuleCategoryResponseBody body;

    public static UpdateSdnsRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSdnsRuleCategoryResponse self = new UpdateSdnsRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSdnsRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSdnsRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSdnsRuleCategoryResponse setBody(UpdateSdnsRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSdnsRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
