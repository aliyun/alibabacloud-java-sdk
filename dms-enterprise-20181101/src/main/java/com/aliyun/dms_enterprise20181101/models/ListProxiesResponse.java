// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProxiesResponseBody body;

    public static ListProxiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProxiesResponse self = new ListProxiesResponse();
        return TeaModel.build(map, self);
    }

    public ListProxiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProxiesResponse setBody(ListProxiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProxiesResponseBody getBody() {
        return this.body;
    }

}
