// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeBatchResponseBody body;

    public static ResumeBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeBatchResponse self = new ResumeBatchResponse();
        return TeaModel.build(map, self);
    }

    public ResumeBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeBatchResponse setBody(ResumeBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeBatchResponseBody getBody() {
        return this.body;
    }

}
