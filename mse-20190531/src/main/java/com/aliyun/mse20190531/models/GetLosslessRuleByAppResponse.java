// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetLosslessRuleByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLosslessRuleByAppResponseBody body;

    public static GetLosslessRuleByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLosslessRuleByAppResponse self = new GetLosslessRuleByAppResponse();
        return TeaModel.build(map, self);
    }

    public GetLosslessRuleByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLosslessRuleByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLosslessRuleByAppResponse setBody(GetLosslessRuleByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLosslessRuleByAppResponseBody getBody() {
        return this.body;
    }

}
