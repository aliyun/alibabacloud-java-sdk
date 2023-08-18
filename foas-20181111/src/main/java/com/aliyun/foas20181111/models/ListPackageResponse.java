// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPackageResponseBody body;

    public static ListPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageResponse self = new ListPackageResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPackageResponse setBody(ListPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageResponseBody getBody() {
        return this.body;
    }

}
