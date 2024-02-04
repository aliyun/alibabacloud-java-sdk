// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCompressPointCloudTaskResponseBody body;

    public static CreateCompressPointCloudTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCompressPointCloudTaskResponse self = new CreateCompressPointCloudTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCompressPointCloudTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCompressPointCloudTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCompressPointCloudTaskResponse setBody(CreateCompressPointCloudTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCompressPointCloudTaskResponseBody getBody() {
        return this.body;
    }

}
