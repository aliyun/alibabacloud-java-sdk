// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaCollectionResponseBody body;

    public static GetMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCollectionResponse self = new GetMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaCollectionResponse setBody(GetMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaCollectionResponseBody getBody() {
        return this.body;
    }

}
