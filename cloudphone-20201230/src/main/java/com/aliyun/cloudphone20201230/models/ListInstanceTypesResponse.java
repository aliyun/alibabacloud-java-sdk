// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceTypesResponseBody body;

    public static ListInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesResponse self = new ListInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceTypesResponse setBody(ListInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
