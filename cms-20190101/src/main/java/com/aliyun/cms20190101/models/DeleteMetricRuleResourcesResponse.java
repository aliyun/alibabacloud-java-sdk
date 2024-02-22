// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricRuleResourcesResponseBody body;

    public static DeleteMetricRuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleResourcesResponse self = new DeleteMetricRuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricRuleResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricRuleResourcesResponse setBody(DeleteMetricRuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

}
