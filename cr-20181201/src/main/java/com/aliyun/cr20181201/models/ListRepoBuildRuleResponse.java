// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoBuildRuleResponseBody body;

    public static ListRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRuleResponse self = new ListRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoBuildRuleResponse setBody(ListRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
