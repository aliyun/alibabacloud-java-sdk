// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMediaResponseBody body;

    public static UpdateMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaResponse self = new UpdateMediaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaResponse setBody(UpdateMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaResponseBody getBody() {
        return this.body;
    }

}
