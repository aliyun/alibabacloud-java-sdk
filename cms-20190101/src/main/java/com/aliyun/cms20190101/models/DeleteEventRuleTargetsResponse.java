// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteEventRuleTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventRuleTargetsResponse setBody(DeleteEventRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
