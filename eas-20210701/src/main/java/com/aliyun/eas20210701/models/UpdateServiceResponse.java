// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceResponseBody body;

    public static UpdateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponse self = new UpdateServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceResponse setBody(UpdateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceResponseBody getBody() {
        return this.body;
    }

}
