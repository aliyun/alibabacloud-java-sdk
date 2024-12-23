// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsPartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsPartitionResponseBody body;

    public static GetMmsPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsPartitionResponse self = new GetMmsPartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsPartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsPartitionResponse setBody(GetMmsPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsPartitionResponseBody getBody() {
        return this.body;
    }

}
