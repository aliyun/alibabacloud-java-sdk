// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostEcsLevelInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostEcsLevelInfoResponseBody body;

    public static DescribeHostEcsLevelInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostEcsLevelInfoResponse self = new DescribeHostEcsLevelInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostEcsLevelInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostEcsLevelInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHostEcsLevelInfoResponse setBody(DescribeHostEcsLevelInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostEcsLevelInfoResponseBody getBody() {
        return this.body;
    }

}
