// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventRuleTargetsResponseBody body;

    public static DeleteEventRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleTargetsResponse self = new DeleteEventRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventRuleTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventRuleTargetsResponse setBody(DeleteEventRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
