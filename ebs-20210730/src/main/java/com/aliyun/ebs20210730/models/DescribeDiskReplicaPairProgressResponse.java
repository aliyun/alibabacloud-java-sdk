// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiskReplicaPairProgressResponseBody body;

    public static DescribeDiskReplicaPairProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairProgressResponse self = new DescribeDiskReplicaPairProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskReplicaPairProgressResponse setBody(DescribeDiskReplicaPairProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskReplicaPairProgressResponseBody getBody() {
        return this.body;
    }

}
