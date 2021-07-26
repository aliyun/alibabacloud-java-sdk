// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpResponseBody body;

    public static ListIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpResponse self = new ListIpResponse();
        return TeaModel.build(map, self);
    }

    public ListIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpResponse setBody(ListIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpResponseBody getBody() {
        return this.body;
    }

}
