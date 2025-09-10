// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusViewsResponseBody body;

    public static ListPrometheusViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusViewsResponse self = new ListPrometheusViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusViewsResponse setBody(ListPrometheusViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusViewsResponseBody getBody() {
        return this.body;
    }

}
