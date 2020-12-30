// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateChartRepositoryResponse setBody(CreateChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
