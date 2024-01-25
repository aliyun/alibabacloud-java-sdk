// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessMetricResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessMetricResourceResponseBody body;

    public static UpdateBusinessMetricResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessMetricResourceResponse self = new UpdateBusinessMetricResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessMetricResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessMetricResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessMetricResourceResponse setBody(UpdateBusinessMetricResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessMetricResourceResponseBody getBody() {
        return this.body;
    }

}
