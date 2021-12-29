// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdateRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRouteRuleResponseBody body;

    public static UpdateRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteRuleResponse self = new UpdateRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteRuleResponse setBody(UpdateRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteRuleResponseBody getBody() {
        return this.body;
    }

}
