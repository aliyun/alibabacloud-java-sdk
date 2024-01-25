// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployApiTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeployApiTaskResponseBody body;

    public static DescribeDeployApiTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployApiTaskResponse self = new DescribeDeployApiTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeployApiTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeployApiTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeployApiTaskResponse setBody(DescribeDeployApiTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeployApiTaskResponseBody getBody() {
        return this.body;
    }

}
