// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityRuleDetailResponseBody body;

    public static GetQualityRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleDetailResponse self = new GetQualityRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleDetailResponse setBody(GetQualityRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleDetailResponseBody getBody() {
        return this.body;
    }

}
