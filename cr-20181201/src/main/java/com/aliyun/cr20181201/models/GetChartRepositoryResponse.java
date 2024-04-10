// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChartRepositoryResponseBody body;

    public static GetChartRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChartRepositoryResponse self = new GetChartRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public GetChartRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChartRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChartRepositoryResponse setBody(GetChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
