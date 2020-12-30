// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotChgBindOrUnBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoIotChgBindOrUnBindResponseBody body;

    public static DoIotChgBindOrUnBindResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIotChgBindOrUnBindResponse self = new DoIotChgBindOrUnBindResponse();
        return TeaModel.build(map, self);
    }

    public DoIotChgBindOrUnBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoIotChgBindOrUnBindResponse setBody(DoIotChgBindOrUnBindResponseBody body) {
        this.body = body;
        return this;
    }
    public DoIotChgBindOrUnBindResponseBody getBody() {
        return this.body;
    }

}
