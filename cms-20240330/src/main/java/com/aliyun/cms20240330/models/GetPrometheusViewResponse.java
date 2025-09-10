// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrometheusViewResponseBody body;

    public static GetPrometheusViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusViewResponse self = new GetPrometheusViewResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusViewResponse setBody(GetPrometheusViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusViewResponseBody getBody() {
        return this.body;
    }

}
