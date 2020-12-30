// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChartRepositoryResponseBody body;

    public static DeleteChartRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartRepositoryResponse self = new DeleteChartRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChartRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChartRepositoryResponse setBody(DeleteChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
