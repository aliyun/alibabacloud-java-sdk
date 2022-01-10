// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkItemResponseBody body;

    public static UpdateWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemResponse self = new UpdateWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkItemResponse setBody(UpdateWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkItemResponseBody getBody() {
        return this.body;
    }

}
