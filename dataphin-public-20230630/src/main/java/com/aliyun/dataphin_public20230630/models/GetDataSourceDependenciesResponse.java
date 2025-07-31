// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataSourceDependenciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceDependenciesResponseBody body;

    public static GetDataSourceDependenciesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDependenciesResponse self = new GetDataSourceDependenciesResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDependenciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceDependenciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceDependenciesResponse setBody(GetDataSourceDependenciesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceDependenciesResponseBody getBody() {
        return this.body;
    }

}
