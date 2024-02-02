// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRuleActionsResponseBody body;

    public static ListRuleActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleActionsResponse self = new ListRuleActionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleActionsResponse setBody(ListRuleActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleActionsResponseBody getBody() {
        return this.body;
    }

}
