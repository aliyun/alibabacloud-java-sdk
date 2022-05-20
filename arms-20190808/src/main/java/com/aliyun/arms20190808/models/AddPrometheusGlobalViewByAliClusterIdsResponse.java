// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddPrometheusGlobalViewByAliClusterIdsResponseBody body;

    public static AddPrometheusGlobalViewByAliClusterIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewByAliClusterIdsResponse self = new AddPrometheusGlobalViewByAliClusterIdsResponse();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponse setBody(AddPrometheusGlobalViewByAliClusterIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrometheusGlobalViewByAliClusterIdsResponseBody getBody() {
        return this.body;
    }

}
