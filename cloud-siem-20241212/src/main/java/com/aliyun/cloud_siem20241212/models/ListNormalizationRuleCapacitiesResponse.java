// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleCapacitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationRuleCapacitiesResponseBody body;

    public static ListNormalizationRuleCapacitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRuleCapacitiesResponse self = new ListNormalizationRuleCapacitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRuleCapacitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationRuleCapacitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationRuleCapacitiesResponse setBody(ListNormalizationRuleCapacitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationRuleCapacitiesResponseBody getBody() {
        return this.body;
    }

}
