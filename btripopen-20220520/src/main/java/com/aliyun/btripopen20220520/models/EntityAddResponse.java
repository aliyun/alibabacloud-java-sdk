// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntityAddResponseBody body;

    public static EntityAddResponse build(java.util.Map<String, ?> map) throws Exception {
        EntityAddResponse self = new EntityAddResponse();
        return TeaModel.build(map, self);
    }

    public EntityAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntityAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntityAddResponse setBody(EntityAddResponseBody body) {
        this.body = body;
        return this;
    }
    public EntityAddResponseBody getBody() {
        return this.body;
    }

}
