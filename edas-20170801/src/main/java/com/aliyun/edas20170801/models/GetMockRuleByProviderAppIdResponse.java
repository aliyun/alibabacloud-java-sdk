// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByProviderAppIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMockRuleByProviderAppIdResponseBody body;

    public static GetMockRuleByProviderAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByProviderAppIdResponse self = new GetMockRuleByProviderAppIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByProviderAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMockRuleByProviderAppIdResponse setBody(GetMockRuleByProviderAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMockRuleByProviderAppIdResponseBody getBody() {
        return this.body;
    }

}
