// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChartRepositoryResponseBody body;

    public static CreateChartRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChartRepositoryResponse self = new CreateChartRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateChartRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChartRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChartRepositoryResponse setBody(CreateChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
