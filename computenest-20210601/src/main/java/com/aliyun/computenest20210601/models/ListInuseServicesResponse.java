// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListInuseServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInuseServicesResponseBody body;

    public static ListInuseServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInuseServicesResponse self = new ListInuseServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListInuseServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInuseServicesResponse setBody(ListInuseServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInuseServicesResponseBody getBody() {
        return this.body;
    }

}
