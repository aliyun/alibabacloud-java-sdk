// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneAppResponseBody body;

    public static CloneAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneAppResponse self = new CloneAppResponse();
        return TeaModel.build(map, self);
    }

    public CloneAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneAppResponse setBody(CloneAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneAppResponseBody getBody() {
        return this.body;
    }

}
