// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateDevopsProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevopsProjectTaskResponseBody body;

    public static UpdateDevopsProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevopsProjectTaskResponse self = new UpdateDevopsProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevopsProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevopsProjectTaskResponse setBody(UpdateDevopsProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevopsProjectTaskResponseBody getBody() {
        return this.body;
    }

}
