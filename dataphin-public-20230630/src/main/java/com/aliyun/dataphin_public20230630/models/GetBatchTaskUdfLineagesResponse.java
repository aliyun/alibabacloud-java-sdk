// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskUdfLineagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTaskUdfLineagesResponseBody body;

    public static GetBatchTaskUdfLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskUdfLineagesResponse self = new GetBatchTaskUdfLineagesResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskUdfLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTaskUdfLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTaskUdfLineagesResponse setBody(GetBatchTaskUdfLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTaskUdfLineagesResponseBody getBody() {
        return this.body;
    }

}
