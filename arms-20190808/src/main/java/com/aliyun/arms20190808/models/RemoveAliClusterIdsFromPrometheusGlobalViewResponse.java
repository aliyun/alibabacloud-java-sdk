// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveAliClusterIdsFromPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body;

    public static RemoveAliClusterIdsFromPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAliClusterIdsFromPrometheusGlobalViewResponse self = new RemoveAliClusterIdsFromPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAliClusterIdsFromPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAliClusterIdsFromPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAliClusterIdsFromPrometheusGlobalViewResponse setBody(RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
