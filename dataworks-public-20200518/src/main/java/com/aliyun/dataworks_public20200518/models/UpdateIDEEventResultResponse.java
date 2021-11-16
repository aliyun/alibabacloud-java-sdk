// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIDEEventResultResponseBody body;

    public static UpdateIDEEventResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIDEEventResultResponse self = new UpdateIDEEventResultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIDEEventResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIDEEventResultResponse setBody(UpdateIDEEventResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIDEEventResultResponseBody getBody() {
        return this.body;
    }

}
