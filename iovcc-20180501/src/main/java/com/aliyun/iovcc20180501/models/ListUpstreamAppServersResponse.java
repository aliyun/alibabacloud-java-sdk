// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUpstreamAppServersResponseBody body;

    public static ListUpstreamAppServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppServersResponse self = new ListUpstreamAppServersResponse();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpstreamAppServersResponse setBody(ListUpstreamAppServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpstreamAppServersResponseBody getBody() {
        return this.body;
    }

}
