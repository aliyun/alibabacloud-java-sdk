// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceVersionResponseBody body;

    public static UpdateServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionResponse self = new UpdateServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceVersionResponse setBody(UpdateServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceVersionResponseBody getBody() {
        return this.body;
    }

}
