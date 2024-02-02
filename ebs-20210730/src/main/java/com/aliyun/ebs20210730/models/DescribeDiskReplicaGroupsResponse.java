// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskReplicaGroupsResponseBody body;

    public static DescribeDiskReplicaGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaGroupsResponse self = new DescribeDiskReplicaGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskReplicaGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskReplicaGroupsResponse setBody(DescribeDiskReplicaGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskReplicaGroupsResponseBody getBody() {
        return this.body;
    }

}
