// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveEntityFromMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveEntityFromMetaCollectionResponseBody body;

    public static RemoveEntityFromMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityFromMetaCollectionResponse self = new RemoveEntityFromMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEntityFromMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEntityFromMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEntityFromMetaCollectionResponse setBody(RemoveEntityFromMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEntityFromMetaCollectionResponseBody getBody() {
        return this.body;
    }

}
