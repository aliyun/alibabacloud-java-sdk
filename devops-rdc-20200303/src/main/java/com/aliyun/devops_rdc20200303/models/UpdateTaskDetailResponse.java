// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskDetailResponseBody body;

    public static UpdateTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskDetailResponse self = new UpdateTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskDetailResponse setBody(UpdateTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskDetailResponseBody getBody() {
        return this.body;
    }

}
