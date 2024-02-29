// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredDeviceBrandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInfraredDeviceBrandsResponseBody body;

    public static ListInfraredDeviceBrandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredDeviceBrandsResponse self = new ListInfraredDeviceBrandsResponse();
        return TeaModel.build(map, self);
    }

    public ListInfraredDeviceBrandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInfraredDeviceBrandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInfraredDeviceBrandsResponse setBody(ListInfraredDeviceBrandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInfraredDeviceBrandsResponseBody getBody() {
        return this.body;
    }

}
