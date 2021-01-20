// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMetricRuleResourcesResponseBody body;

    public static CreateMetricRuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleResourcesResponse self = new CreateMetricRuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricRuleResourcesResponse setBody(CreateMetricRuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

}
