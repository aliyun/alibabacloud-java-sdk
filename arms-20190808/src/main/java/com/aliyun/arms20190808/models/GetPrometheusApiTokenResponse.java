// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrometheusApiTokenResponseBody body;

    public static GetPrometheusApiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenResponse self = new GetPrometheusApiTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusApiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusApiTokenResponse setBody(GetPrometheusApiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusApiTokenResponseBody getBody() {
        return this.body;
    }

}
