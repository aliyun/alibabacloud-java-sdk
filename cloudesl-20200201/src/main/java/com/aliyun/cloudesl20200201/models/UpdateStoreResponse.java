// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStoreResponseBody body;

    public static UpdateStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreResponse self = new UpdateStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoreResponse setBody(UpdateStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoreResponseBody getBody() {
        return this.body;
    }

}
