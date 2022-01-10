// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class CreatePodFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePodFromCMDBResponseBody body;

    public static CreatePodFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePodFromCMDBResponse self = new CreatePodFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public CreatePodFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePodFromCMDBResponse setBody(CreatePodFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePodFromCMDBResponseBody getBody() {
        return this.body;
    }

}
