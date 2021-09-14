// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GiveScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GiveScreenResponseBody body;

    public static GiveScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        GiveScreenResponse self = new GiveScreenResponse();
        return TeaModel.build(map, self);
    }

    public GiveScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GiveScreenResponse setBody(GiveScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public GiveScreenResponseBody getBody() {
        return this.body;
    }

}
