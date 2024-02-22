// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupMetricRulesResponseBody body;

    public static CreateGroupMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesResponse self = new CreateGroupMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupMetricRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupMetricRulesResponse setBody(CreateGroupMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupMetricRulesResponseBody getBody() {
        return this.body;
    }

}
