// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListVpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcsResponseBody body;

    public static ListVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcsResponse self = new ListVpcsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcsResponse setBody(ListVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcsResponseBody getBody() {
        return this.body;
    }

}
