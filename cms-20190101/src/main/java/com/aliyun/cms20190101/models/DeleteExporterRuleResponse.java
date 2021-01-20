// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteExporterRuleResponse setBody(DeleteExporterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExporterRuleResponseBody getBody() {
        return this.body;
    }

}
