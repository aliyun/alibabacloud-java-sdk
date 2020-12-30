// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateAppPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppPackageResponseBody body;

    public static UpdateAppPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPackageResponse self = new UpdateAppPackageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppPackageResponse setBody(UpdateAppPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppPackageResponseBody getBody() {
        return this.body;
    }

}
