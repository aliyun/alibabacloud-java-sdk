// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScrollDomainListResponseBody body;

    public static ScrollDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListResponse self = new ScrollDomainListResponse();
        return TeaModel.build(map, self);
    }

    public ScrollDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScrollDomainListResponse setBody(ScrollDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public ScrollDomainListResponseBody getBody() {
        return this.body;
    }

}
