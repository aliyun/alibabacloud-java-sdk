// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuleResponseBody body;

    public static GetRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponse self = new GetRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleResponse setBody(GetRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleResponseBody getBody() {
        return this.body;
    }

}
