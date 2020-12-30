// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceEndpointResponseBody body;

    public static ListInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceEndpointResponse self = new ListInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceEndpointResponse setBody(ListInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
