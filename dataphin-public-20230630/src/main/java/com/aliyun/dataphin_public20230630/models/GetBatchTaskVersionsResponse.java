// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTaskVersionsResponseBody body;

    public static GetBatchTaskVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskVersionsResponse self = new GetBatchTaskVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTaskVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTaskVersionsResponse setBody(GetBatchTaskVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTaskVersionsResponseBody getBody() {
        return this.body;
    }

}
