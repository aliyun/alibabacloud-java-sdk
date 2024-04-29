// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DetachSceneDefenseObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachSceneDefenseObjectResponseBody body;

    public static DetachSceneDefenseObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachSceneDefenseObjectResponse self = new DetachSceneDefenseObjectResponse();
        return TeaModel.build(map, self);
    }

    public DetachSceneDefenseObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachSceneDefenseObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachSceneDefenseObjectResponse setBody(DetachSceneDefenseObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

}
