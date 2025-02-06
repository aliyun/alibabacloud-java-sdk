// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class SyncFacePicturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncFacePicturesResponseBody body;

    public static SyncFacePicturesResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncFacePicturesResponse self = new SyncFacePicturesResponse();
        return TeaModel.build(map, self);
    }

    public SyncFacePicturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncFacePicturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncFacePicturesResponse setBody(SyncFacePicturesResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncFacePicturesResponseBody getBody() {
        return this.body;
    }

}
