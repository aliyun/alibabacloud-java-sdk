// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackendModelResponseBody body;

    public static DeleteBackendModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendModelResponse self = new DeleteBackendModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackendModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackendModelResponse setBody(DeleteBackendModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackendModelResponseBody getBody() {
        return this.body;
    }

}
