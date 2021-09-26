// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListMetaClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetaClusterResponseBody body;

    public static ListMetaClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaClusterResponse self = new ListMetaClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaClusterResponse setBody(ListMetaClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaClusterResponseBody getBody() {
        return this.body;
    }

}
