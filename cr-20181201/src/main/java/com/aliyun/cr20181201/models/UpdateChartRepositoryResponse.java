// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateChartRepositoryResponseBody body;

    public static UpdateChartRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChartRepositoryResponse self = new UpdateChartRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChartRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChartRepositoryResponse setBody(UpdateChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
