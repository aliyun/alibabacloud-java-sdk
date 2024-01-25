// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessMetricSceneListResponseBody body;

    public static GetBusinessMetricSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricSceneListResponse self = new GetBusinessMetricSceneListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessMetricSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessMetricSceneListResponse setBody(GetBusinessMetricSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessMetricSceneListResponseBody getBody() {
        return this.body;
    }

}
