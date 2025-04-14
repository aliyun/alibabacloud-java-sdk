// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddEntityIntoMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEntityIntoMetaCollectionResponseBody body;

    public static AddEntityIntoMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEntityIntoMetaCollectionResponse self = new AddEntityIntoMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public AddEntityIntoMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEntityIntoMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEntityIntoMetaCollectionResponse setBody(AddEntityIntoMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEntityIntoMetaCollectionResponseBody getBody() {
        return this.body;
    }

}
