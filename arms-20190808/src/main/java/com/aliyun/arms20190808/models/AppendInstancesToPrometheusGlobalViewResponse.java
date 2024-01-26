// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppendInstancesToPrometheusGlobalViewResponseBody body;

    public static AppendInstancesToPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        AppendInstancesToPrometheusGlobalViewResponse self = new AppendInstancesToPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public AppendInstancesToPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppendInstancesToPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppendInstancesToPrometheusGlobalViewResponse setBody(AppendInstancesToPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public AppendInstancesToPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
