// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEcsNotInClusterResponseBody body;

    public static ListEcsNotInClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcsNotInClusterResponse self = new ListEcsNotInClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListEcsNotInClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsNotInClusterResponse setBody(ListEcsNotInClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsNotInClusterResponseBody getBody() {
        return this.body;
    }

}
