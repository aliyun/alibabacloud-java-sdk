// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListRpcServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRpcServicesResponseBody body;

    public static ListRpcServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRpcServicesResponse self = new ListRpcServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListRpcServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRpcServicesResponse setBody(ListRpcServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRpcServicesResponseBody getBody() {
        return this.body;
    }

}
