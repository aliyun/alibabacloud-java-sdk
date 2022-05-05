// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrometheusGlobalViewResponseBody body;

    public static GetPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusGlobalViewResponse self = new GetPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusGlobalViewResponse setBody(GetPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
