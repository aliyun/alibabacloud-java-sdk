// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSlsLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSlsLogStoreResponseBody body;

    public static UpdateSlsLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsLogStoreResponse self = new UpdateSlsLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlsLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlsLogStoreResponse setBody(UpdateSlsLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlsLogStoreResponseBody getBody() {
        return this.body;
    }

}
