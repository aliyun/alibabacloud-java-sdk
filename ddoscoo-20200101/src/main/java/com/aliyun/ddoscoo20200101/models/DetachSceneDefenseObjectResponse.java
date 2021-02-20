// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DetachSceneDefenseObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetachSceneDefenseObjectResponse setBody(DetachSceneDefenseObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

}
