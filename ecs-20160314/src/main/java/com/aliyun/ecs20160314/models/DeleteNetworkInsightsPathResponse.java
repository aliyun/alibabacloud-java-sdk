// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkInsightsPathResponseBody body;

    public static DeleteNetworkInsightsPathResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsPathResponse self = new DeleteNetworkInsightsPathResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkInsightsPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkInsightsPathResponse setBody(DeleteNetworkInsightsPathResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkInsightsPathResponseBody getBody() {
        return this.body;
    }

}
