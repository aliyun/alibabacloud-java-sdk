// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDrdsInstanceResponseBody body;

    public static RemoveDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsInstanceResponse self = new RemoveDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDrdsInstanceResponse setBody(RemoveDrdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDrdsInstanceResponseBody getBody() {
        return this.body;
    }

}
