// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateVideoClipTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoClipTaskResponseBody body;

    public static CreateVideoClipTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoClipTaskResponse self = new CreateVideoClipTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoClipTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoClipTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoClipTaskResponse setBody(CreateVideoClipTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoClipTaskResponseBody getBody() {
        return this.body;
    }

}
