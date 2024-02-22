// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutExporterRuleResponseBody body;

    public static PutExporterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutExporterRuleResponse self = new PutExporterRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutExporterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutExporterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutExporterRuleResponse setBody(PutExporterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutExporterRuleResponseBody getBody() {
        return this.body;
    }

}
