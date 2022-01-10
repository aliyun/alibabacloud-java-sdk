// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcesResponseBody body;

    public static ListResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponse self = new ListResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesResponse setBody(ListResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesResponseBody getBody() {
        return this.body;
    }

}
