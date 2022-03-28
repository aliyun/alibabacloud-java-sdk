// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class UpdateTaskPriorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskPriorityResponseBody body;

    public static UpdateTaskPriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskPriorityResponse self = new UpdateTaskPriorityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskPriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskPriorityResponse setBody(UpdateTaskPriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskPriorityResponseBody getBody() {
        return this.body;
    }

}
