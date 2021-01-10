// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectorsResponseBody body;

    public static ListConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponse self = new ListConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectorsResponse setBody(ListConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectorsResponseBody getBody() {
        return this.body;
    }

}
