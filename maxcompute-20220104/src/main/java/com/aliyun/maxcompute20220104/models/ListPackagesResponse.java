// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPackagesResponseBody body;

    public static ListPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackagesResponse self = new ListPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPackagesResponse setBody(ListPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackagesResponseBody getBody() {
        return this.body;
    }

}
