// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityRuleTaskResponseBody body;

    public static GetQualityRuleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTaskResponse self = new GetQualityRuleTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleTaskResponse setBody(GetQualityRuleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleTaskResponseBody getBody() {
        return this.body;
    }

}
