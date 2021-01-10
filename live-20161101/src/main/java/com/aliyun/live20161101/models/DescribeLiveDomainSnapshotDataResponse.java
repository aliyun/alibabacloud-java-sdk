// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainSnapshotDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainSnapshotDataResponseBody body;

    public static DescribeLiveDomainSnapshotDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainSnapshotDataResponse self = new DescribeLiveDomainSnapshotDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainSnapshotDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainSnapshotDataResponse setBody(DescribeLiveDomainSnapshotDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainSnapshotDataResponseBody getBody() {
        return this.body;
    }

}
