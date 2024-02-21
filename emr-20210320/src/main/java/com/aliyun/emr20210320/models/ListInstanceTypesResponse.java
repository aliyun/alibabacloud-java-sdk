// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
