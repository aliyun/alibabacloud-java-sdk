// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusGlobalViewResponse setBody(GetPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
