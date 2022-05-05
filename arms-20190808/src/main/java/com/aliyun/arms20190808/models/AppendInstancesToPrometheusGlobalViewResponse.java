// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AppendInstancesToPrometheusGlobalViewResponse setBody(AppendInstancesToPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public AppendInstancesToPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
