// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListCSBGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCSBGatewayResponseBody body;

    public static ListCSBGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCSBGatewayResponse self = new ListCSBGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ListCSBGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCSBGatewayResponse setBody(ListCSBGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCSBGatewayResponseBody getBody() {
        return this.body;
    }

}
