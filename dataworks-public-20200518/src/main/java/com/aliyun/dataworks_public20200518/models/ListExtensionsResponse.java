// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExtensionsResponseBody body;

    public static ListExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExtensionsResponse self = new ListExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public ListExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExtensionsResponse setBody(ListExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExtensionsResponseBody getBody() {
        return this.body;
    }

}
