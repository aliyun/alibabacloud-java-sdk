// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssBucketReplicationRulesResponseBody body;

    public static DescribeOssBucketReplicationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationRulesResponse self = new DescribeOssBucketReplicationRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssBucketReplicationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssBucketReplicationRulesResponse setBody(DescribeOssBucketReplicationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssBucketReplicationRulesResponseBody getBody() {
        return this.body;
    }

}
