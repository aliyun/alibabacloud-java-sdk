// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsGetRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdnsGetRuleCategoryResponseBody body;

    public static SdnsGetRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SdnsGetRuleCategoryResponse self = new SdnsGetRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public SdnsGetRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdnsGetRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdnsGetRuleCategoryResponse setBody(SdnsGetRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SdnsGetRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
