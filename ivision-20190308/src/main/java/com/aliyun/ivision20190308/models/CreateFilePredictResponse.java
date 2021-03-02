// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateFilePredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFilePredictResponseBody body;

    public static CreateFilePredictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFilePredictResponse self = new CreateFilePredictResponse();
        return TeaModel.build(map, self);
    }

    public CreateFilePredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFilePredictResponse setBody(CreateFilePredictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFilePredictResponseBody getBody() {
        return this.body;
    }

}
