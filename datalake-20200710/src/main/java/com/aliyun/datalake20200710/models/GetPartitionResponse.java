// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetPartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPartitionResponseBody body;

    public static GetPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionResponse self = new GetPartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPartitionResponse setBody(GetPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartitionResponseBody getBody() {
        return this.body;
    }

}
