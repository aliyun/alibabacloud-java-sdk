// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteThingModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteThingModelResponseBody body;

    public static DeleteThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteThingModelResponse self = new DeleteThingModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteThingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteThingModelResponse setBody(DeleteThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteThingModelResponseBody getBody() {
        return this.body;
    }

}
