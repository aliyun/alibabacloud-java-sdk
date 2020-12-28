// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class PullImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullImageResponseBody body;

    public static PullImageResponse build(java.util.Map<String, ?> map) throws Exception {
        PullImageResponse self = new PullImageResponse();
        return TeaModel.build(map, self);
    }

    public PullImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullImageResponse setBody(PullImageResponseBody body) {
        this.body = body;
        return this;
    }
    public PullImageResponseBody getBody() {
        return this.body;
    }

}
