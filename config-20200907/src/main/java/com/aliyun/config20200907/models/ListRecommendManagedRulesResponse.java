// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRecommendManagedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecommendManagedRulesResponseBody body;

    public static ListRecommendManagedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendManagedRulesResponse self = new ListRecommendManagedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecommendManagedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecommendManagedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecommendManagedRulesResponse setBody(ListRecommendManagedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecommendManagedRulesResponseBody getBody() {
        return this.body;
    }

}
