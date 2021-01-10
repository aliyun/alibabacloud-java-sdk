// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppKeyRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUpstreamAppKeyRelationsResponseBody body;

    public static ListUpstreamAppKeyRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppKeyRelationsResponse self = new ListUpstreamAppKeyRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppKeyRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpstreamAppKeyRelationsResponse setBody(ListUpstreamAppKeyRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpstreamAppKeyRelationsResponseBody getBody() {
        return this.body;
    }

}
