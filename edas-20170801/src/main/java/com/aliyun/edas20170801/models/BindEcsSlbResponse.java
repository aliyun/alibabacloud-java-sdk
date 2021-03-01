// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindEcsSlbResponseBody body;

    public static BindEcsSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEcsSlbResponse self = new BindEcsSlbResponse();
        return TeaModel.build(map, self);
    }

    public BindEcsSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEcsSlbResponse setBody(BindEcsSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEcsSlbResponseBody getBody() {
        return this.body;
    }

}
