// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class ListVersionPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVersionPackagesResponseBody body;

    public static ListVersionPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionPackagesResponse self = new ListVersionPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVersionPackagesResponse setBody(ListVersionPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVersionPackagesResponseBody getBody() {
        return this.body;
    }

}
