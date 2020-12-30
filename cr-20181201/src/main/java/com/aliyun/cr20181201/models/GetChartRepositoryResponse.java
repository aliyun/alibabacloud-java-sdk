// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetChartRepositoryResponse setBody(GetChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
