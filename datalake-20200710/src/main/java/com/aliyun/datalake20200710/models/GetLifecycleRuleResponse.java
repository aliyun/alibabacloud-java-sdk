// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLifecycleRuleResponseBody body;

    public static GetLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleRuleResponse self = new GetLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLifecycleRuleResponse setBody(GetLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
