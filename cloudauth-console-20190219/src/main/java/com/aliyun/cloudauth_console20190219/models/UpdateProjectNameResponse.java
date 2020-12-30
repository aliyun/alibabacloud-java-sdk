// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateProjectNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProjectNameResponseBody body;

    public static UpdateProjectNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectNameResponse self = new UpdateProjectNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectNameResponse setBody(UpdateProjectNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectNameResponseBody getBody() {
        return this.body;
    }

}
