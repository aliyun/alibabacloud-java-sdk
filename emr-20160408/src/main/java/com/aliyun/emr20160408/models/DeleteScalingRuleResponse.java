// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScalingRuleResponseBody body;

    public static DeleteScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingRuleResponse self = new DeleteScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScalingRuleResponse setBody(DeleteScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingRuleResponseBody getBody() {
        return this.body;
    }

}
