// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteEventCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventCenterRuleResponseBody body;

    public static DeleteEventCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventCenterRuleResponse self = new DeleteEventCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventCenterRuleResponse setBody(DeleteEventCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventCenterRuleResponseBody getBody() {
        return this.body;
    }

}
