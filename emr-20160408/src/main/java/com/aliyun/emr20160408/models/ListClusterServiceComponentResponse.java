// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterServiceComponentResponseBody body;

    public static ListClusterServiceComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceComponentResponse self = new ListClusterServiceComponentResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceComponentResponse setBody(ListClusterServiceComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceComponentResponseBody getBody() {
        return this.body;
    }

}
