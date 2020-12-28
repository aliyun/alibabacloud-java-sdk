// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetricsOfResourceResponseBody body;

    public static GetMetricsOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfResourceResponse self = new GetMetricsOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricsOfResourceResponse setBody(GetMetricsOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

}
