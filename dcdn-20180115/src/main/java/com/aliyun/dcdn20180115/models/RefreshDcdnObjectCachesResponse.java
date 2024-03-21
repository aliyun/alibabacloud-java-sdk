// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshDcdnObjectCachesResponseBody body;

    public static RefreshDcdnObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesResponse self = new RefreshDcdnObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDcdnObjectCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDcdnObjectCachesResponse setBody(RefreshDcdnObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDcdnObjectCachesResponseBody getBody() {
        return this.body;
    }

}
