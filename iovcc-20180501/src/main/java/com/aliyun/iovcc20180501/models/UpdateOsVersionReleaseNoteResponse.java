// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionReleaseNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsVersionReleaseNoteResponseBody body;

    public static UpdateOsVersionReleaseNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionReleaseNoteResponse self = new UpdateOsVersionReleaseNoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionReleaseNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsVersionReleaseNoteResponse setBody(UpdateOsVersionReleaseNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsVersionReleaseNoteResponseBody getBody() {
        return this.body;
    }

}
