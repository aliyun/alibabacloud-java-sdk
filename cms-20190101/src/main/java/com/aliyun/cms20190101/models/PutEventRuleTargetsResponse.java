// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutEventRuleTargetsResponseBody body;

    public static PutEventRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleTargetsResponse self = new PutEventRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public PutEventRuleTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEventRuleTargetsResponse setBody(PutEventRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
