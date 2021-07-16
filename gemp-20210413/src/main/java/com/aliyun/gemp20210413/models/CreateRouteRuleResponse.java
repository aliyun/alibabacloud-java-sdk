// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRouteRuleResponseBody body;

    public static CreateRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteRuleResponse self = new CreateRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteRuleResponse setBody(CreateRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteRuleResponseBody getBody() {
        return this.body;
    }

}
