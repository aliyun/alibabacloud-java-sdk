// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDataSourceResponseBody body;

    public static UpdateDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceResponse self = new UpdateDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourceResponse setBody(UpdateDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourceResponseBody getBody() {
        return this.body;
    }

}
