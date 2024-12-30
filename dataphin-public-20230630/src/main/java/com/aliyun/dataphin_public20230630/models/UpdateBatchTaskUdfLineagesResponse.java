// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskUdfLineagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBatchTaskUdfLineagesResponseBody body;

    public static UpdateBatchTaskUdfLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTaskUdfLineagesResponse self = new UpdateBatchTaskUdfLineagesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTaskUdfLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBatchTaskUdfLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBatchTaskUdfLineagesResponse setBody(UpdateBatchTaskUdfLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBatchTaskUdfLineagesResponseBody getBody() {
        return this.body;
    }

}
