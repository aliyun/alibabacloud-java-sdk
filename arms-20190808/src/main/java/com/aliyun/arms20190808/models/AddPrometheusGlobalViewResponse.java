// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrometheusGlobalViewResponseBody body;

    public static AddPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewResponse self = new AddPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrometheusGlobalViewResponse setBody(AddPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
