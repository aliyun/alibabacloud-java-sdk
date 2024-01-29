// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListInstanceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceCountResponseBody body;

    public static ListInstanceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCountResponse self = new ListInstanceCountResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceCountResponse setBody(ListInstanceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceCountResponseBody getBody() {
        return this.body;
    }

}
