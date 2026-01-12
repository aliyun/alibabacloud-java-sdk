// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteMemoryCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MemoryCollectionResult body;

    public static DeleteMemoryCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryCollectionResponse self = new DeleteMemoryCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemoryCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemoryCollectionResponse setBody(MemoryCollectionResult body) {
        this.body = body;
        return this;
    }
    public MemoryCollectionResult getBody() {
        return this.body;
    }

}
