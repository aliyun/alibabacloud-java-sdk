// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppVersionStatusResponseBody body;

    public static UpdateAppVersionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionStatusResponse self = new UpdateAppVersionStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppVersionStatusResponse setBody(UpdateAppVersionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppVersionStatusResponseBody getBody() {
        return this.body;
    }

}
