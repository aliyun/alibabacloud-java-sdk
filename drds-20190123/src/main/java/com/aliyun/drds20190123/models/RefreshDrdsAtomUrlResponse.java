// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RefreshDrdsAtomUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshDrdsAtomUrlResponseBody body;

    public static RefreshDrdsAtomUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDrdsAtomUrlResponse self = new RefreshDrdsAtomUrlResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDrdsAtomUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDrdsAtomUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDrdsAtomUrlResponse setBody(RefreshDrdsAtomUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDrdsAtomUrlResponseBody getBody() {
        return this.body;
    }

}
