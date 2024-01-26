// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusGlobalViewResponseBody body;

    public static UpdatePrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusGlobalViewResponse self = new UpdatePrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusGlobalViewResponse setBody(UpdatePrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
