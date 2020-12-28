// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListVirtualHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVirtualHostsResponseBody body;

    public static ListVirtualHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualHostsResponse self = new ListVirtualHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualHostsResponse setBody(ListVirtualHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualHostsResponseBody getBody() {
        return this.body;
    }

}
