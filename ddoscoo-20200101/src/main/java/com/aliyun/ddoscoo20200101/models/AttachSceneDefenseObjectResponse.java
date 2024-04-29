// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachSceneDefenseObjectResponseBody body;

    public static AttachSceneDefenseObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachSceneDefenseObjectResponse self = new AttachSceneDefenseObjectResponse();
        return TeaModel.build(map, self);
    }

    public AttachSceneDefenseObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachSceneDefenseObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachSceneDefenseObjectResponse setBody(AttachSceneDefenseObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

}
