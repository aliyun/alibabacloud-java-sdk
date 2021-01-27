// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpSetsResponseBody body;

    public static ListIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpSetsResponse self = new ListIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpSetsResponse setBody(ListIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpSetsResponseBody getBody() {
        return this.body;
    }

}
