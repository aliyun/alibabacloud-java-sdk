// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsDeleteRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdnsDeleteRuleCategoryResponseBody body;

    public static SdnsDeleteRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SdnsDeleteRuleCategoryResponse self = new SdnsDeleteRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public SdnsDeleteRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdnsDeleteRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdnsDeleteRuleCategoryResponse setBody(SdnsDeleteRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SdnsDeleteRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
