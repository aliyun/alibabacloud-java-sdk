// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddItemLimitRuleResponseBody body;

    public static AddItemLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddItemLimitRuleResponse self = new AddItemLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddItemLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddItemLimitRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddItemLimitRuleResponse setBody(AddItemLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddItemLimitRuleResponseBody getBody() {
        return this.body;
    }

}
