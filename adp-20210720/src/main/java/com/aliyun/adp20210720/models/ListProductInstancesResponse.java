// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductInstancesResponseBody body;

    public static ListProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesResponse self = new ListProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductInstancesResponse setBody(ListProductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductInstancesResponseBody getBody() {
        return this.body;
    }

}
