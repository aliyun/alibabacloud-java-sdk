// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDiskReplicaPairProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskReplicaPairProgressResponse setBody(DescribeDiskReplicaPairProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskReplicaPairProgressResponseBody getBody() {
        return this.body;
    }

}
