// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateStreamPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStreamPredictResponseBody body;

    public static CreateStreamPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPredictResponse self = new CreateStreamPredictResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamPredictResponse setBody(CreateStreamPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamPredictResponseBody getBody() {
        return this.body;
    }

}
