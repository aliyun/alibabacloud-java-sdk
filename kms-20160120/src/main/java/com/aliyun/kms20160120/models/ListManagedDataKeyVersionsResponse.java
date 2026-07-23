// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListManagedDataKeyVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManagedDataKeyVersionsResponseBody body;

    public static ListManagedDataKeyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManagedDataKeyVersionsResponse self = new ListManagedDataKeyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListManagedDataKeyVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManagedDataKeyVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManagedDataKeyVersionsResponse setBody(ListManagedDataKeyVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManagedDataKeyVersionsResponseBody getBody() {
        return this.body;
    }

}
