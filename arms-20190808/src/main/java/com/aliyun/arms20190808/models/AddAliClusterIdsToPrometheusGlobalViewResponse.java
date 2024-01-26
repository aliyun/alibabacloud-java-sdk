// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddAliClusterIdsToPrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAliClusterIdsToPrometheusGlobalViewResponseBody body;

    public static AddAliClusterIdsToPrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAliClusterIdsToPrometheusGlobalViewResponse self = new AddAliClusterIdsToPrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public AddAliClusterIdsToPrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAliClusterIdsToPrometheusGlobalViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAliClusterIdsToPrometheusGlobalViewResponse setBody(AddAliClusterIdsToPrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAliClusterIdsToPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
