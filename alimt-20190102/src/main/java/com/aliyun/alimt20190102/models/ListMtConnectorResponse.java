// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20190102.models;

import com.aliyun.tea.*;

public class ListMtConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMtConnectorResponseBody body;

    public static ListMtConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMtConnectorResponse self = new ListMtConnectorResponse();
        return TeaModel.build(map, self);
    }

    public ListMtConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMtConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMtConnectorResponse setBody(ListMtConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMtConnectorResponseBody getBody() {
        return this.body;
    }

}
