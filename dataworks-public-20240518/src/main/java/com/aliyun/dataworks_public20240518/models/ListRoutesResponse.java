// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutesResponseBody body;

    public static ListRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutesResponse self = new ListRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutesResponse setBody(ListRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutesResponseBody getBody() {
        return this.body;
    }

}
