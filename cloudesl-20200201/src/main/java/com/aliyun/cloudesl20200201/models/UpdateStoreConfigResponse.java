// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStoreConfigResponseBody body;

    public static UpdateStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreConfigResponse self = new UpdateStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoreConfigResponse setBody(UpdateStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoreConfigResponseBody getBody() {
        return this.body;
    }

}
