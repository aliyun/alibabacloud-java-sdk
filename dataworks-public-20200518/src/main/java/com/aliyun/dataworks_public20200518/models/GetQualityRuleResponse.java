// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityRuleResponseBody body;

    public static GetQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleResponse self = new GetQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleResponse setBody(GetQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleResponseBody getBody() {
        return this.body;
    }

}
