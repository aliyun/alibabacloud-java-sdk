// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolAllIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectionPoolAllIpsResponseBody body;

    public static ListConnectionPoolAllIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolAllIpsResponse self = new ListConnectionPoolAllIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolAllIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectionPoolAllIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConnectionPoolAllIpsResponse setBody(ListConnectionPoolAllIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectionPoolAllIpsResponseBody getBody() {
        return this.body;
    }

}
