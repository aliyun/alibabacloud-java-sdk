// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteMetricRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricRulesResponse setBody(DeleteMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRulesResponseBody getBody() {
        return this.body;
    }

}
