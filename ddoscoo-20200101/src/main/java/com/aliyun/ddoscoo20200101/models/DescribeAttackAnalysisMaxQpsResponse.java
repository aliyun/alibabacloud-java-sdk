// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisMaxQpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttackAnalysisMaxQpsResponseBody body;

    public static DescribeAttackAnalysisMaxQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisMaxQpsResponse self = new DescribeAttackAnalysisMaxQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisMaxQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackAnalysisMaxQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttackAnalysisMaxQpsResponse setBody(DescribeAttackAnalysisMaxQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackAnalysisMaxQpsResponseBody getBody() {
        return this.body;
    }

}
