// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProxyAccessesResponseBody body;

    public static ListProxyAccessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProxyAccessesResponse self = new ListProxyAccessesResponse();
        return TeaModel.build(map, self);
    }

    public ListProxyAccessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProxyAccessesResponse setBody(ListProxyAccessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProxyAccessesResponseBody getBody() {
        return this.body;
    }

}
