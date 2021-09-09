// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDescriptionResponseBody body;

    public static UpdateDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDescriptionResponse self = new UpdateDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDescriptionResponse setBody(UpdateDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDescriptionResponseBody getBody() {
        return this.body;
    }

}
