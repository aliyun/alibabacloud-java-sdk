// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopsFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveShopsFromGroupResponseBody body;

    public static RemoveShopsFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveShopsFromGroupResponse self = new RemoveShopsFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveShopsFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveShopsFromGroupResponse setBody(RemoveShopsFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveShopsFromGroupResponseBody getBody() {
        return this.body;
    }

}
