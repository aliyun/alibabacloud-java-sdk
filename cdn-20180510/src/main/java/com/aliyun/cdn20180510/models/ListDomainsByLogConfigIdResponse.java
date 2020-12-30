// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListDomainsByLogConfigIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDomainsByLogConfigIdResponseBody body;

    public static ListDomainsByLogConfigIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsByLogConfigIdResponse self = new ListDomainsByLogConfigIdResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainsByLogConfigIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainsByLogConfigIdResponse setBody(ListDomainsByLogConfigIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainsByLogConfigIdResponseBody getBody() {
        return this.body;
    }

}
