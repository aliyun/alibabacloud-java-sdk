// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListRuleTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListRuleTasksResponse setBody(ListRuleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleTasksResponseBody getBody() {
        return this.body;
    }

}
