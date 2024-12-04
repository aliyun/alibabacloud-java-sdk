// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityRuleResponseBody body;

    public static GetDataQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleResponse self = new GetDataQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityRuleResponse setBody(GetDataQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityRuleResponseBody getBody() {
        return this.body;
    }

}
