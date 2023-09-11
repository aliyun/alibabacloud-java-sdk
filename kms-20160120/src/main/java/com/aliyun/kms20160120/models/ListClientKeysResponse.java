// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListClientKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClientKeysResponseBody body;

    public static ListClientKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientKeysResponse self = new ListClientKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListClientKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientKeysResponse setBody(ListClientKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientKeysResponseBody getBody() {
        return this.body;
    }

}
