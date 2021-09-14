// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConstantsResponseBody body;

    public static CreateConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConstantsResponse self = new CreateConstantsResponse();
        return TeaModel.build(map, self);
    }

    public CreateConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConstantsResponse setBody(CreateConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConstantsResponseBody getBody() {
        return this.body;
    }

}
