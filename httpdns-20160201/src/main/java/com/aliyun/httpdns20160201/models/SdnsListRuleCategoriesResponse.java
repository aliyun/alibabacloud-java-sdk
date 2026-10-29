// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsListRuleCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdnsListRuleCategoriesResponseBody body;

    public static SdnsListRuleCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SdnsListRuleCategoriesResponse self = new SdnsListRuleCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public SdnsListRuleCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdnsListRuleCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdnsListRuleCategoriesResponse setBody(SdnsListRuleCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public SdnsListRuleCategoriesResponseBody getBody() {
        return this.body;
    }

}
