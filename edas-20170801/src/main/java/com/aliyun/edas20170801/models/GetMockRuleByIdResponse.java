// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMockRuleByIdResponseBody body;

    public static GetMockRuleByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByIdResponse self = new GetMockRuleByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMockRuleByIdResponse setBody(GetMockRuleByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMockRuleByIdResponseBody getBody() {
        return this.body;
    }

}
