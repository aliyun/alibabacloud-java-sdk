// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteMetricRuleResourcesResponse setBody(DeleteMetricRuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

}
