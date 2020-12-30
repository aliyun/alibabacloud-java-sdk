// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotPostImeiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoIotPostImeiResponseBody body;

    public static DoIotPostImeiResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIotPostImeiResponse self = new DoIotPostImeiResponse();
        return TeaModel.build(map, self);
    }

    public DoIotPostImeiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoIotPostImeiResponse setBody(DoIotPostImeiResponseBody body) {
        this.body = body;
        return this;
    }
    public DoIotPostImeiResponseBody getBody() {
        return this.body;
    }

}
