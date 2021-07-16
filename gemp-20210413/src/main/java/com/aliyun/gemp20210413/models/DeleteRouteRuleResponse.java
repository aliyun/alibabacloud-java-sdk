// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteRouteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRouteRuleResponseBody body;

    public static DeleteRouteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteRuleResponse self = new DeleteRouteRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteRuleResponse setBody(DeleteRouteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteRuleResponseBody getBody() {
        return this.body;
    }

}
