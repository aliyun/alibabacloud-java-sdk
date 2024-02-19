// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCollectionResponseBody body;

    public static CreateCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectionResponse self = new CreateCollectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCollectionResponse setBody(CreateCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCollectionResponseBody getBody() {
        return this.body;
    }

}
