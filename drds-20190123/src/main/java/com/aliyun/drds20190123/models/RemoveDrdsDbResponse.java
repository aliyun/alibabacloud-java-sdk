// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDrdsDbResponseBody body;

    public static RemoveDrdsDbResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbResponse self = new RemoveDrdsDbResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDrdsDbResponse setBody(RemoveDrdsDbResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDrdsDbResponseBody getBody() {
        return this.body;
    }

}
