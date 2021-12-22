// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListConnectionPoolIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectionPoolIpResponseBody body;

    public static ListConnectionPoolIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolIpResponse self = new ListConnectionPoolIpResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectionPoolIpResponse setBody(ListConnectionPoolIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectionPoolIpResponseBody getBody() {
        return this.body;
    }

}
