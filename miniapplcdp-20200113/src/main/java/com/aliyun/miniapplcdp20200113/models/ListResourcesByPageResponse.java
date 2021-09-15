// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcesByPageResponseBody body;

    public static ListResourcesByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByPageResponse self = new ListResourcesByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesByPageResponse setBody(ListResourcesByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesByPageResponseBody getBody() {
        return this.body;
    }

}
