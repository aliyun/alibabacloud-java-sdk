// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDynamicRoutesResponseBody body;

    public static ListDynamicRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicRoutesResponse self = new ListDynamicRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicRoutesResponse setBody(ListDynamicRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicRoutesResponseBody getBody() {
        return this.body;
    }

}
