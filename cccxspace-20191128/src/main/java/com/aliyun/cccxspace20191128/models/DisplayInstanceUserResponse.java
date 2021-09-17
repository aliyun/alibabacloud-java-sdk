// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DisplayInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisplayInstanceUserResponseBody body;

    public static DisplayInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DisplayInstanceUserResponse self = new DisplayInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public DisplayInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisplayInstanceUserResponse setBody(DisplayInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DisplayInstanceUserResponseBody getBody() {
        return this.body;
    }

}
