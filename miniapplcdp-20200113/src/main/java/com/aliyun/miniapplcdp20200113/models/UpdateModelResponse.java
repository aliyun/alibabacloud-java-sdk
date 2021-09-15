// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateModelResponseBody body;

    public static UpdateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelResponse self = new UpdateModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelResponse setBody(UpdateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelResponseBody getBody() {
        return this.body;
    }

}
