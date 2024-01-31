// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntityDeleteResponseBody body;

    public static EntityDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        EntityDeleteResponse self = new EntityDeleteResponse();
        return TeaModel.build(map, self);
    }

    public EntityDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntityDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntityDeleteResponse setBody(EntityDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public EntityDeleteResponseBody getBody() {
        return this.body;
    }

}
