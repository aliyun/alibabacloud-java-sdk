// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class GetDbfsServerMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDbfsServerMetricResponseBody body;

    public static GetDbfsServerMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsServerMetricResponse self = new GetDbfsServerMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetDbfsServerMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDbfsServerMetricResponse setBody(GetDbfsServerMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDbfsServerMetricResponseBody getBody() {
        return this.body;
    }

}
