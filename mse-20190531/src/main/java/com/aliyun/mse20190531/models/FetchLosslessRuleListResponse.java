// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class FetchLosslessRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchLosslessRuleListResponseBody body;

    public static FetchLosslessRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchLosslessRuleListResponse self = new FetchLosslessRuleListResponse();
        return TeaModel.build(map, self);
    }

    public FetchLosslessRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchLosslessRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchLosslessRuleListResponse setBody(FetchLosslessRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchLosslessRuleListResponseBody getBody() {
        return this.body;
    }

}
