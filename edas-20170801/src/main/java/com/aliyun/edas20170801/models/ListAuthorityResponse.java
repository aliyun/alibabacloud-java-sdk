// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorityResponseBody body;

    public static ListAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityResponse self = new ListAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorityResponse setBody(ListAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorityResponseBody getBody() {
        return this.body;
    }

}
