// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAlertRuleResponseBody body;

    public static UpdateAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleResponse self = new UpdateAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertRuleResponse setBody(UpdateAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertRuleResponseBody getBody() {
        return this.body;
    }

}
