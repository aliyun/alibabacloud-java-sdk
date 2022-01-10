// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class UpdatePodFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePodFromCMDBResponseBody body;

    public static UpdatePodFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePodFromCMDBResponse self = new UpdatePodFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePodFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePodFromCMDBResponse setBody(UpdatePodFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePodFromCMDBResponseBody getBody() {
        return this.body;
    }

}
