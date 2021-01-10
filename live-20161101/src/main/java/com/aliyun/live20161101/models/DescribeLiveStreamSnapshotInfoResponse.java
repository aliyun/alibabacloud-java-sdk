// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamSnapshotInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamSnapshotInfoResponseBody body;

    public static DescribeLiveStreamSnapshotInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamSnapshotInfoResponse self = new DescribeLiveStreamSnapshotInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamSnapshotInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamSnapshotInfoResponse setBody(DescribeLiveStreamSnapshotInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamSnapshotInfoResponseBody getBody() {
        return this.body;
    }

}
