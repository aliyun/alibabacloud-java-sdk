// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ReImplementRuleInspectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReImplementRuleInspectionResponseBody body;

    public static ReImplementRuleInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReImplementRuleInspectionResponse self = new ReImplementRuleInspectionResponse();
        return TeaModel.build(map, self);
    }

    public ReImplementRuleInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReImplementRuleInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReImplementRuleInspectionResponse setBody(ReImplementRuleInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReImplementRuleInspectionResponseBody getBody() {
        return this.body;
    }

}
