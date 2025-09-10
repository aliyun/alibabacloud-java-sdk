// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusVirtualInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrometheusVirtualInstanceResponseBody body;

    public static CreatePrometheusVirtualInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusVirtualInstanceResponse self = new CreatePrometheusVirtualInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusVirtualInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrometheusVirtualInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrometheusVirtualInstanceResponse setBody(CreatePrometheusVirtualInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrometheusVirtualInstanceResponseBody getBody() {
        return this.body;
    }

}
