// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRecommendManagedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateRecommendManagedRulesResponseBody body;

    public static ListAggregateRecommendManagedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRecommendManagedRulesResponse self = new ListAggregateRecommendManagedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateRecommendManagedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateRecommendManagedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateRecommendManagedRulesResponse setBody(ListAggregateRecommendManagedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateRecommendManagedRulesResponseBody getBody() {
        return this.body;
    }

}
