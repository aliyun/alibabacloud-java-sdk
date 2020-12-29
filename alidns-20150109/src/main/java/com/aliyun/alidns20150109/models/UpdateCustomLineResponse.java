// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomLineResponseBody body;

    public static UpdateCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineResponse self = new UpdateCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomLineResponse setBody(UpdateCustomLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomLineResponseBody getBody() {
        return this.body;
    }

}
