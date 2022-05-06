// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessRuleResponseBody body;

    public static GetAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessRuleResponse self = new GetAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessRuleResponse setBody(GetAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessRuleResponseBody getBody() {
        return this.body;
    }

}
