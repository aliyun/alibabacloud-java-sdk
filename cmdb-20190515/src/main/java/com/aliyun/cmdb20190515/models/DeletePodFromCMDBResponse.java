// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class DeletePodFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePodFromCMDBResponseBody body;

    public static DeletePodFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePodFromCMDBResponse self = new DeletePodFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public DeletePodFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePodFromCMDBResponse setBody(DeletePodFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePodFromCMDBResponseBody getBody() {
        return this.body;
    }

}
