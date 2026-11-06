// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateImageTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageTaskResponseBody body;

    public static UpdateImageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageTaskResponse self = new UpdateImageTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageTaskResponse setBody(UpdateImageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageTaskResponseBody getBody() {
        return this.body;
    }

}
