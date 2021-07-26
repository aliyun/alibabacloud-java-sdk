// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateResourceInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceInformationResponseBody body;

    public static CreateResourceInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInformationResponse self = new CreateResourceInformationResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceInformationResponse setBody(CreateResourceInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceInformationResponseBody getBody() {
        return this.body;
    }

}
