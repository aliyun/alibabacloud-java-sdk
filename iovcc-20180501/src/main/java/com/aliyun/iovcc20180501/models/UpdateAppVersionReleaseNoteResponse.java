// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionReleaseNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppVersionReleaseNoteResponseBody body;

    public static UpdateAppVersionReleaseNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionReleaseNoteResponse self = new UpdateAppVersionReleaseNoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionReleaseNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppVersionReleaseNoteResponse setBody(UpdateAppVersionReleaseNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppVersionReleaseNoteResponseBody getBody() {
        return this.body;
    }

}
