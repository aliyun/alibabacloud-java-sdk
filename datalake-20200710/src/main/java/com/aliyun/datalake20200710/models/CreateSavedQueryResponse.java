// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateSavedQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSavedQueryResponseBody body;

    public static CreateSavedQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedQueryResponse self = new CreateSavedQueryResponse();
        return TeaModel.build(map, self);
    }

    public CreateSavedQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavedQueryResponse setBody(CreateSavedQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSavedQueryResponseBody getBody() {
        return this.body;
    }

}
