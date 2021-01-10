// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppVersionResponseBody body;

    public static UpdateAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionResponse self = new UpdateAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppVersionResponse setBody(UpdateAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppVersionResponseBody getBody() {
        return this.body;
    }

}
