// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class PublishScreenWithSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishScreenWithSnapshotResponseBody body;

    public static PublishScreenWithSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishScreenWithSnapshotResponse self = new PublishScreenWithSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public PublishScreenWithSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishScreenWithSnapshotResponse setBody(PublishScreenWithSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishScreenWithSnapshotResponseBody getBody() {
        return this.body;
    }

}
