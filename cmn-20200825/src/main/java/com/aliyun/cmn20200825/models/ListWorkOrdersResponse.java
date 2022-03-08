// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListWorkOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkOrdersResponseBody body;

    public static ListWorkOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkOrdersResponse self = new ListWorkOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkOrdersResponse setBody(ListWorkOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkOrdersResponseBody getBody() {
        return this.body;
    }

}
