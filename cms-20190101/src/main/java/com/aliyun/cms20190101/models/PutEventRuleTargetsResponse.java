// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PutEventRuleTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEventRuleTargetsResponse setBody(PutEventRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
