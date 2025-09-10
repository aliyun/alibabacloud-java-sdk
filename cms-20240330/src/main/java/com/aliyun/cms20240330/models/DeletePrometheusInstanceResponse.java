// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeletePrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusInstanceResponseBody body;

    public static DeletePrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusInstanceResponse self = new DeletePrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusInstanceResponse setBody(DeletePrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
