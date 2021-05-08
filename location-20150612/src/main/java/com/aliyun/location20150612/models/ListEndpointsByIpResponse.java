// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsByIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEndpointsByIpResponseBody body;

    public static ListEndpointsByIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsByIpResponse self = new ListEndpointsByIpResponse();
        return TeaModel.build(map, self);
    }

    public ListEndpointsByIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEndpointsByIpResponse setBody(ListEndpointsByIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEndpointsByIpResponseBody getBody() {
        return this.body;
    }

}
