// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsVerifyRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdnsVerifyRuleCategoryResponseBody body;

    public static SdnsVerifyRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SdnsVerifyRuleCategoryResponse self = new SdnsVerifyRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public SdnsVerifyRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdnsVerifyRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdnsVerifyRuleCategoryResponse setBody(SdnsVerifyRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SdnsVerifyRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
