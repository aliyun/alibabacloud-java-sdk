// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeletePrometheusVirtualInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusVirtualInstanceResponseBody body;

    public static DeletePrometheusVirtualInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusVirtualInstanceResponse self = new DeletePrometheusVirtualInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusVirtualInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusVirtualInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusVirtualInstanceResponse setBody(DeletePrometheusVirtualInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusVirtualInstanceResponseBody getBody() {
        return this.body;
    }

}
