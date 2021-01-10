// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMediaCoverResponseBody body;

    public static UpdateMediaCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCoverResponse self = new UpdateMediaCoverResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaCoverResponse setBody(UpdateMediaCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaCoverResponseBody getBody() {
        return this.body;
    }

}
