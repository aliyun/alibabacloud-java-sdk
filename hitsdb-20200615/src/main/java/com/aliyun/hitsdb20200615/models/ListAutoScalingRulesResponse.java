// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoScalingRulesResponseBody body;

    public static ListAutoScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesResponse self = new ListAutoScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoScalingRulesResponse setBody(ListAutoScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingRulesResponseBody getBody() {
        return this.body;
    }

}
