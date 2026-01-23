// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertQualityRuleResponseBody body;

    public static UpsertQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityRuleResponse self = new UpsertQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpsertQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertQualityRuleResponse setBody(UpsertQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertQualityRuleResponseBody getBody() {
        return this.body;
    }

}
