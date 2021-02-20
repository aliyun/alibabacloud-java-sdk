// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserPortsResponseBody body;

    public static ListUserPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPortsResponse self = new ListUserPortsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPortsResponse setBody(ListUserPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPortsResponseBody getBody() {
        return this.body;
    }

}
