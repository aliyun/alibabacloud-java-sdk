// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationRuleVersionsResponseBody body;

    public static ListNormalizationRuleVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRuleVersionsResponse self = new ListNormalizationRuleVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRuleVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationRuleVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationRuleVersionsResponse setBody(ListNormalizationRuleVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationRuleVersionsResponseBody getBody() {
        return this.body;
    }

}
