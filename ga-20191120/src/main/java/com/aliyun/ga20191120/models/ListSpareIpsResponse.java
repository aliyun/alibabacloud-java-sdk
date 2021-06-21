// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSpareIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSpareIpsResponseBody body;

    public static ListSpareIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpareIpsResponse self = new ListSpareIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListSpareIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpareIpsResponse setBody(ListSpareIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpareIpsResponseBody getBody() {
        return this.body;
    }

}
