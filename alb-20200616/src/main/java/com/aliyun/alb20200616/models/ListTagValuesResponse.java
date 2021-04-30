// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagValuesResponseBody body;

    public static ListTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesResponse self = new ListTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagValuesResponse setBody(ListTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagValuesResponseBody getBody() {
        return this.body;
    }

}
