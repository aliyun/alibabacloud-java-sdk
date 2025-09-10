// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusViewResponseBody body;

    public static UpdatePrometheusViewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusViewResponse self = new UpdatePrometheusViewResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusViewResponse setBody(UpdatePrometheusViewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusViewResponseBody getBody() {
        return this.body;
    }

}
