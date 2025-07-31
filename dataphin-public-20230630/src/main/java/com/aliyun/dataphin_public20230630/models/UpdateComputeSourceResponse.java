// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeSourceResponseBody body;

    public static UpdateComputeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeSourceResponse self = new UpdateComputeSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeSourceResponse setBody(UpdateComputeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeSourceResponseBody getBody() {
        return this.body;
    }

}
