// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcdpAimResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcdpAimResponseBody body;

    public static ListMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimResponse self = new ListMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public ListMcdpAimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcdpAimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcdpAimResponse setBody(ListMcdpAimResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcdpAimResponseBody getBody() {
        return this.body;
    }

}
