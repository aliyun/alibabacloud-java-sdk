// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListAdvertisingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAdvertisingResponseBody body;

    public static ListAdvertisingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdvertisingResponse self = new ListAdvertisingResponse();
        return TeaModel.build(map, self);
    }

    public ListAdvertisingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdvertisingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdvertisingResponse setBody(ListAdvertisingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdvertisingResponseBody getBody() {
        return this.body;
    }

}
