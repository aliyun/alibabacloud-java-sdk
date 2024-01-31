// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntitySetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntitySetResponseBody body;

    public static EntitySetResponse build(java.util.Map<String, ?> map) throws Exception {
        EntitySetResponse self = new EntitySetResponse();
        return TeaModel.build(map, self);
    }

    public EntitySetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntitySetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntitySetResponse setBody(EntitySetResponseBody body) {
        this.body = body;
        return this;
    }
    public EntitySetResponseBody getBody() {
        return this.body;
    }

}
