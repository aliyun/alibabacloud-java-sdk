// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByConsumerAppIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMockRuleByConsumerAppIdResponseBody body;

    public static GetMockRuleByConsumerAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByConsumerAppIdResponse self = new GetMockRuleByConsumerAppIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByConsumerAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMockRuleByConsumerAppIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMockRuleByConsumerAppIdResponse setBody(GetMockRuleByConsumerAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMockRuleByConsumerAppIdResponseBody getBody() {
        return this.body;
    }

}
