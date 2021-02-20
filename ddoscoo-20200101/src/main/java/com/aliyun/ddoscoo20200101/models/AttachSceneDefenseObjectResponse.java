// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AttachSceneDefenseObjectResponse setBody(AttachSceneDefenseObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

}
