// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshObjectCachesResponseBody body;

    public static RefreshObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCachesResponse self = new RefreshObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshObjectCachesResponse setBody(RefreshObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshObjectCachesResponseBody getBody() {
        return this.body;
    }

}
