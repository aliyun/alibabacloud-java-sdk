// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPushRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPushRuleResponseBody body;

    public static GetPushRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPushRuleResponse self = new GetPushRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetPushRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPushRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPushRuleResponse setBody(GetPushRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPushRuleResponseBody getBody() {
        return this.body;
    }

}
