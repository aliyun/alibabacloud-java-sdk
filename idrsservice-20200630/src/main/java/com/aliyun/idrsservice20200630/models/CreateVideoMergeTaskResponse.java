// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoMergeTaskResponseBody body;

    public static CreateVideoMergeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskResponse self = new CreateVideoMergeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoMergeTaskResponse setBody(CreateVideoMergeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoMergeTaskResponseBody getBody() {
        return this.body;
    }

}
