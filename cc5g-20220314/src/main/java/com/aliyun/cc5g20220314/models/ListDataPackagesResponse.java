// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDataPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataPackagesResponseBody body;

    public static ListDataPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataPackagesResponse self = new ListDataPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataPackagesResponse setBody(ListDataPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataPackagesResponseBody getBody() {
        return this.body;
    }

}
