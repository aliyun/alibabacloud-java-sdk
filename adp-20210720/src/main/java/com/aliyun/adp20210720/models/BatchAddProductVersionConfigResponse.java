// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class BatchAddProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddProductVersionConfigResponseBody body;

    public static BatchAddProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddProductVersionConfigResponse self = new BatchAddProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddProductVersionConfigResponse setBody(BatchAddProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
