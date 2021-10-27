// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeInstanceNetworkResponseBody body;

    public static ChangeInstanceNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceNetworkResponse self = new ChangeInstanceNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeInstanceNetworkResponse setBody(ChangeInstanceNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeInstanceNetworkResponseBody getBody() {
        return this.body;
    }

}
