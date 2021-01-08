// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateDevopsProjectSprintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevopsProjectSprintResponseBody body;

    public static UpdateDevopsProjectSprintResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevopsProjectSprintResponse self = new UpdateDevopsProjectSprintResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevopsProjectSprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevopsProjectSprintResponse setBody(UpdateDevopsProjectSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevopsProjectSprintResponseBody getBody() {
        return this.body;
    }

}
