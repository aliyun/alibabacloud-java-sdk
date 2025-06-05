// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCollectionResponseBody body;

    public static ModifyCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollectionResponse self = new ModifyCollectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCollectionResponse setBody(ModifyCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCollectionResponseBody getBody() {
        return this.body;
    }

}
