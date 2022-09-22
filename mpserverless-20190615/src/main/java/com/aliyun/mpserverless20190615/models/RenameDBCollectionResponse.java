// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RenameDBCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenameDBCollectionResponseBody body;

    public static RenameDBCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameDBCollectionResponse self = new RenameDBCollectionResponse();
        return TeaModel.build(map, self);
    }

    public RenameDBCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameDBCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameDBCollectionResponse setBody(RenameDBCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameDBCollectionResponseBody getBody() {
        return this.body;
    }

}
