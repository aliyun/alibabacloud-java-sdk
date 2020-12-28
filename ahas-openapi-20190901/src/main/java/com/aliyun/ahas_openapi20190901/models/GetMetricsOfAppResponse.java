// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetricsOfAppResponseBody body;

    public static GetMetricsOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfAppResponse self = new GetMetricsOfAppResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricsOfAppResponse setBody(GetMetricsOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricsOfAppResponseBody getBody() {
        return this.body;
    }

}
