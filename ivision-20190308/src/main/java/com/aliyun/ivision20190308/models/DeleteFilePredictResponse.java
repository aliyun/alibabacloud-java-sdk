// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteFilePredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFilePredictResponseBody body;

    public static DeleteFilePredictResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilePredictResponse self = new DeleteFilePredictResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilePredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilePredictResponse setBody(DeleteFilePredictResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilePredictResponseBody getBody() {
        return this.body;
    }

}
