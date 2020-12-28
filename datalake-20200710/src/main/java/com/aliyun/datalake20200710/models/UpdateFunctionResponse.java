// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFunctionResponseBody body;

    public static UpdateFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResponse self = new UpdateFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionResponse setBody(UpdateFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionResponseBody getBody() {
        return this.body;
    }

}
