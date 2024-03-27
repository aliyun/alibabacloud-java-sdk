// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreatePublishGroupTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublishGroupTaskResponseBody body;

    public static CreatePublishGroupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishGroupTaskResponse self = new CreatePublishGroupTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublishGroupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublishGroupTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublishGroupTaskResponse setBody(CreatePublishGroupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublishGroupTaskResponseBody getBody() {
        return this.body;
    }

}
