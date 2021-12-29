// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRouteRuleResponseBody body;

    public static AddRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRouteRuleResponse self = new AddRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRouteRuleResponse setBody(AddRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRouteRuleResponseBody getBody() {
        return this.body;
    }

}
