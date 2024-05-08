// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateVideoMergeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoMergeTaskResponse setBody(CreateVideoMergeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoMergeTaskResponseBody getBody() {
        return this.body;
    }

}
