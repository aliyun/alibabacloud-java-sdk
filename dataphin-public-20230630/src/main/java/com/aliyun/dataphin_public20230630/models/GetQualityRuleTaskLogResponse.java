// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityRuleTaskLogResponseBody body;

    public static GetQualityRuleTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTaskLogResponse self = new GetQualityRuleTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleTaskLogResponse setBody(GetQualityRuleTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleTaskLogResponseBody getBody() {
        return this.body;
    }

}
