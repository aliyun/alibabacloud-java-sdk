// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAliwsDictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAliwsDictResponseBody body;

    public static UpdateAliwsDictResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliwsDictResponse self = new UpdateAliwsDictResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAliwsDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAliwsDictResponse setBody(UpdateAliwsDictResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAliwsDictResponseBody getBody() {
        return this.body;
    }

}
