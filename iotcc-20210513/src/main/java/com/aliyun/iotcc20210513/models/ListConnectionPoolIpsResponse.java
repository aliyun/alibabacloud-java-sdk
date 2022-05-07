// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectionPoolIpsResponseBody body;

    public static ListConnectionPoolIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolIpsResponse self = new ListConnectionPoolIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectionPoolIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConnectionPoolIpsResponse setBody(ListConnectionPoolIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectionPoolIpsResponseBody getBody() {
        return this.body;
    }

}
