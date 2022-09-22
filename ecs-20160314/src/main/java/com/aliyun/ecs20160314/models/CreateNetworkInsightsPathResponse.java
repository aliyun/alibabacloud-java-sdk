// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateNetworkInsightsPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkInsightsPathResponseBody body;

    public static CreateNetworkInsightsPathResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInsightsPathResponse self = new CreateNetworkInsightsPathResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInsightsPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkInsightsPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkInsightsPathResponse setBody(CreateNetworkInsightsPathResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkInsightsPathResponseBody getBody() {
        return this.body;
    }

}
