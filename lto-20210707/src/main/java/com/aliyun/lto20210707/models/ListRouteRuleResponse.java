// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRouteRuleResponseBody body;

    public static ListRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRuleResponse self = new ListRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteRuleResponse setBody(ListRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteRuleResponseBody getBody() {
        return this.body;
    }

}
