// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateC2paBucketSignTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateC2paBucketSignTaskResponseBody body;

    public static CreateC2paBucketSignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateC2paBucketSignTaskResponse self = new CreateC2paBucketSignTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateC2paBucketSignTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateC2paBucketSignTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateC2paBucketSignTaskResponse setBody(CreateC2paBucketSignTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateC2paBucketSignTaskResponseBody getBody() {
        return this.body;
    }

}
