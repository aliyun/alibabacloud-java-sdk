// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeleteItemLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteItemLimitRuleResponseBody body;

    public static DeleteItemLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemLimitRuleResponse self = new DeleteItemLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteItemLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteItemLimitRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteItemLimitRuleResponse setBody(DeleteItemLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteItemLimitRuleResponseBody getBody() {
        return this.body;
    }

}
