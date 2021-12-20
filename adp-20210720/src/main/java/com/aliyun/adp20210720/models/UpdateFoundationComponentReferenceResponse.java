// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateFoundationComponentReferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFoundationComponentReferenceResponseBody body;

    public static UpdateFoundationComponentReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFoundationComponentReferenceResponse self = new UpdateFoundationComponentReferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFoundationComponentReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFoundationComponentReferenceResponse setBody(UpdateFoundationComponentReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFoundationComponentReferenceResponseBody getBody() {
        return this.body;
    }

}
