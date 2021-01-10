// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteStreamPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStreamPredictResponseBody body;

    public static DeleteStreamPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamPredictResponse self = new DeleteStreamPredictResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamPredictResponse setBody(DeleteStreamPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamPredictResponseBody getBody() {
        return this.body;
    }

}
