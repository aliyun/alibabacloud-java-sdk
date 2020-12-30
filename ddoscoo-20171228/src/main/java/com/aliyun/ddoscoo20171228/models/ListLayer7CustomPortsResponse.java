// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListLayer7CustomPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLayer7CustomPortsResponseBody body;

    public static ListLayer7CustomPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLayer7CustomPortsResponse self = new ListLayer7CustomPortsResponse();
        return TeaModel.build(map, self);
    }

    public ListLayer7CustomPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLayer7CustomPortsResponse setBody(ListLayer7CustomPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLayer7CustomPortsResponseBody getBody() {
        return this.body;
    }

}
