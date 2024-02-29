// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetaCollectionResponseBody body;

    public static CreateMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCollectionResponse self = new CreateMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetaCollectionResponse setBody(CreateMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetaCollectionResponseBody getBody() {
        return this.body;
    }

}
