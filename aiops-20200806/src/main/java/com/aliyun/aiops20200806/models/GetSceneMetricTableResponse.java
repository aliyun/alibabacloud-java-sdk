// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneMetricTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSceneMetricTableResponseBody body;

    public static GetSceneMetricTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneMetricTableResponse self = new GetSceneMetricTableResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneMetricTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneMetricTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSceneMetricTableResponse setBody(GetSceneMetricTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneMetricTableResponseBody getBody() {
        return this.body;
    }

}
