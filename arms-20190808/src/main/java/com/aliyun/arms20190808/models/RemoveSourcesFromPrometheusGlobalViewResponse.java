// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSourcesFromPrometheusGlobalViewResponseBody body;

    public static RemoveSourcesFromPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromPrometheusGlobalViewResponse self = new RemoveSourcesFromPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponse setBody(RemoveSourcesFromPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSourcesFromPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
