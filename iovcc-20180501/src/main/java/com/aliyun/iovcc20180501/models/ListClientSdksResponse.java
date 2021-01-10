// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientSdksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClientSdksResponseBody body;

    public static ListClientSdksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientSdksResponse self = new ListClientSdksResponse();
        return TeaModel.build(map, self);
    }

    public ListClientSdksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientSdksResponse setBody(ListClientSdksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientSdksResponseBody getBody() {
        return this.body;
    }

}
