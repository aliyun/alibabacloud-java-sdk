// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMetricRulesResponseBody body;

    public static DeleteMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRulesResponse self = new DeleteMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricRulesResponse setBody(DeleteMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRulesResponseBody getBody() {
        return this.body;
    }

}
