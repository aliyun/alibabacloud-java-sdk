// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppVersionRemarkResponseBody body;

    public static UpdateAppVersionRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRemarkResponse self = new UpdateAppVersionRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppVersionRemarkResponse setBody(UpdateAppVersionRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppVersionRemarkResponseBody getBody() {
        return this.body;
    }

}
