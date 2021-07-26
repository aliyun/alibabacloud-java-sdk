// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceInstancesResponseBody body;

    public static ListResourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstancesResponse self = new ListResourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceInstancesResponse setBody(ListResourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceInstancesResponseBody getBody() {
        return this.body;
    }

}
