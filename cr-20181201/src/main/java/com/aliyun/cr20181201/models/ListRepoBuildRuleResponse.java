// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListRepoBuildRuleResponse setBody(ListRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
