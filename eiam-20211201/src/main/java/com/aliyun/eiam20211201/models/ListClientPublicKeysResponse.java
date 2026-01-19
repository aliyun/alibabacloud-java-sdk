// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListClientPublicKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientPublicKeysResponseBody body;

    public static ListClientPublicKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientPublicKeysResponse self = new ListClientPublicKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListClientPublicKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientPublicKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientPublicKeysResponse setBody(ListClientPublicKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientPublicKeysResponseBody getBody() {
        return this.body;
    }

}
