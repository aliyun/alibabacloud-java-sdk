// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeletePrometheusViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusViewResponseBody body;

    public static DeletePrometheusViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusViewResponse self = new DeletePrometheusViewResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusViewResponse setBody(DeletePrometheusViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusViewResponseBody getBody() {
        return this.body;
    }

}
