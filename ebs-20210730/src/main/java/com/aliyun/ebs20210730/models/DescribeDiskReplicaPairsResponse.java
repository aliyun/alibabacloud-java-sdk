// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskReplicaPairsResponseBody body;

    public static DescribeDiskReplicaPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsResponse self = new DescribeDiskReplicaPairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskReplicaPairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskReplicaPairsResponse setBody(DescribeDiskReplicaPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskReplicaPairsResponseBody getBody() {
        return this.body;
    }

}
