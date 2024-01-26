// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusGlobalViewResponseBody body;

    public static ListPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusGlobalViewResponse self = new ListPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusGlobalViewResponse setBody(ListPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
