// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityRuleListResponseBody body;

    public static GetQualityRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleListResponse self = new GetQualityRuleListResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleListResponse setBody(GetQualityRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleListResponseBody getBody() {
        return this.body;
    }

}
