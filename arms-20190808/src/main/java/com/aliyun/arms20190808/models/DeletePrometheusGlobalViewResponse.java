// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusGlobalViewResponseBody body;

    public static DeletePrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewResponse self = new DeletePrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusGlobalViewResponse setBody(DeletePrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
