// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteComputeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComputeSourceResponseBody body;

    public static DeleteComputeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeSourceResponse self = new DeleteComputeSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComputeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComputeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComputeSourceResponse setBody(DeleteComputeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComputeSourceResponseBody getBody() {
        return this.body;
    }

}
