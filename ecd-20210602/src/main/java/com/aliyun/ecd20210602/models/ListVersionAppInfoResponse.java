// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListVersionAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVersionAppInfoResponseBody body;

    public static ListVersionAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionAppInfoResponse self = new ListVersionAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVersionAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVersionAppInfoResponse setBody(ListVersionAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVersionAppInfoResponseBody getBody() {
        return this.body;
    }

}
