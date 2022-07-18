// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListStressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListStressesResponseBody body;

    public static ListStressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStressesResponse self = new ListStressesResponse();
        return TeaModel.build(map, self);
    }

    public ListStressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStressesResponse setBody(ListStressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStressesResponseBody getBody() {
        return this.body;
    }

}
