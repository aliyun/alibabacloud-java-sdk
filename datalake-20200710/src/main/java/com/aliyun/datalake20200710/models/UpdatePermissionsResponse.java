// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdatePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePermissionsResponseBody body;

    public static UpdatePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionsResponse self = new UpdatePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePermissionsResponse setBody(UpdatePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePermissionsResponseBody getBody() {
        return this.body;
    }

}
