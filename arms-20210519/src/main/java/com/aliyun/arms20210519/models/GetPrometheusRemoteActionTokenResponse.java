// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteActionTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrometheusRemoteActionTokenResponseBody body;

    public static GetPrometheusRemoteActionTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteActionTokenResponse self = new GetPrometheusRemoteActionTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteActionTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusRemoteActionTokenResponse setBody(GetPrometheusRemoteActionTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusRemoteActionTokenResponseBody getBody() {
        return this.body;
    }

}
