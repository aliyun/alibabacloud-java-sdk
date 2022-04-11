// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListIpsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpsStatusResponseBody body;

    public static ListIpsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpsStatusResponse self = new ListIpsStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListIpsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpsStatusResponse setBody(ListIpsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpsStatusResponseBody getBody() {
        return this.body;
    }

}
