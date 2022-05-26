// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PreloadDcdnObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PreloadDcdnObjectCachesResponseBody body;

    public static PreloadDcdnObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadDcdnObjectCachesResponse self = new PreloadDcdnObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public PreloadDcdnObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadDcdnObjectCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreloadDcdnObjectCachesResponse setBody(PreloadDcdnObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadDcdnObjectCachesResponseBody getBody() {
        return this.body;
    }

}
