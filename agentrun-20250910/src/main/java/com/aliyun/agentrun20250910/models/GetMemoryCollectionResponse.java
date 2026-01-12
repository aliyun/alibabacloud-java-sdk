// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MemoryCollectionResult body;

    public static GetMemoryCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryCollectionResponse self = new GetMemoryCollectionResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryCollectionResponse setBody(MemoryCollectionResult body) {
        this.body = body;
        return this;
    }
    public MemoryCollectionResult getBody() {
        return this.body;
    }

}
