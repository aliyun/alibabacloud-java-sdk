// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ChangeRuleGroupValidStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeRuleGroupValidStatusResponseBody body;

    public static ChangeRuleGroupValidStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRuleGroupValidStatusResponse self = new ChangeRuleGroupValidStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRuleGroupValidStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRuleGroupValidStatusResponse setBody(ChangeRuleGroupValidStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRuleGroupValidStatusResponseBody getBody() {
        return this.body;
    }

}
