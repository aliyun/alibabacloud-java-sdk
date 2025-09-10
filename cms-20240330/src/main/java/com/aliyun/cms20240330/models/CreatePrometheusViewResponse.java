// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrometheusViewResponseBody body;

    public static CreatePrometheusViewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusViewResponse self = new CreatePrometheusViewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrometheusViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrometheusViewResponse setBody(CreatePrometheusViewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrometheusViewResponseBody getBody() {
        return this.body;
    }

}
