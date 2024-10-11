// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRuleTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRuleTasksResponseBody body;

    public static ListRuleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTasksResponse self = new ListRuleTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleTasksResponse setBody(ListRuleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleTasksResponseBody getBody() {
        return this.body;
    }

}
