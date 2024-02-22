// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExporterRuleResponseBody body;

    public static DeleteExporterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterRuleResponse self = new DeleteExporterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExporterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExporterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExporterRuleResponse setBody(DeleteExporterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExporterRuleResponseBody getBody() {
        return this.body;
    }

}
