// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEndpointsResponseBody body;

    public static ListEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsResponse self = new ListEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEndpointsResponse setBody(ListEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEndpointsResponseBody getBody() {
        return this.body;
    }

}
