// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePartProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePartProductResponseBody body;

    public static UpdatePartProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartProductResponse self = new UpdatePartProductResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePartProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePartProductResponse setBody(UpdatePartProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePartProductResponseBody getBody() {
        return this.body;
    }

}
