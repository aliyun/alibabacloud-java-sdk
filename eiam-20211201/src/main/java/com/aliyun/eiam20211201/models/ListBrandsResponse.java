// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListBrandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBrandsResponseBody body;

    public static ListBrandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBrandsResponse self = new ListBrandsResponse();
        return TeaModel.build(map, self);
    }

    public ListBrandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBrandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBrandsResponse setBody(ListBrandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBrandsResponseBody getBody() {
        return this.body;
    }

}
