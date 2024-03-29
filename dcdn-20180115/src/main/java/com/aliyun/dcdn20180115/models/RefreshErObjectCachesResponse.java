// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshErObjectCachesResponseBody body;

    public static RefreshErObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesResponse self = new RefreshErObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshErObjectCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshErObjectCachesResponse setBody(RefreshErObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshErObjectCachesResponseBody getBody() {
        return this.body;
    }

}
