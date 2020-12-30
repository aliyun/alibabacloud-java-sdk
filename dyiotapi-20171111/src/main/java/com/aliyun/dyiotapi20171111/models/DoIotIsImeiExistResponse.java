// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotIsImeiExistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoIotIsImeiExistResponseBody body;

    public static DoIotIsImeiExistResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIotIsImeiExistResponse self = new DoIotIsImeiExistResponse();
        return TeaModel.build(map, self);
    }

    public DoIotIsImeiExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoIotIsImeiExistResponse setBody(DoIotIsImeiExistResponseBody body) {
        this.body = body;
        return this;
    }
    public DoIotIsImeiExistResponseBody getBody() {
        return this.body;
    }

}
