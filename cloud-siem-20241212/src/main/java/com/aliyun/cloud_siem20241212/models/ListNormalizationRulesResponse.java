// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationRulesResponseBody body;

    public static ListNormalizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRulesResponse self = new ListNormalizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationRulesResponse setBody(ListNormalizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationRulesResponseBody getBody() {
        return this.body;
    }

}
