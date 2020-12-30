// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoTagScanTaskResponseBody body;

    public static CreateRepoTagScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTagScanTaskResponse self = new CreateRepoTagScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoTagScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoTagScanTaskResponse setBody(CreateRepoTagScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoTagScanTaskResponseBody getBody() {
        return this.body;
    }

}
