// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityRuleTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitQualityRuleTasksResponseBody body;

    public static SubmitQualityRuleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityRuleTasksResponse self = new SubmitQualityRuleTasksResponse();
        return TeaModel.build(map, self);
    }

    public SubmitQualityRuleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitQualityRuleTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitQualityRuleTasksResponse setBody(SubmitQualityRuleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitQualityRuleTasksResponseBody getBody() {
        return this.body;
    }

}
