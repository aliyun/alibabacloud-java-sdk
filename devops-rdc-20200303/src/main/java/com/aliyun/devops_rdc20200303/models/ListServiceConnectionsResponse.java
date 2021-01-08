// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceConnectionsResponseBody body;

    public static ListServiceConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsResponse self = new ListServiceConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceConnectionsResponse setBody(ListServiceConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceConnectionsResponseBody getBody() {
        return this.body;
    }

}
