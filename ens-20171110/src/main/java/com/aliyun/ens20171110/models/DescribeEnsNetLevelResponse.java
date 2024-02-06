// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsNetLevelResponseBody body;

    public static DescribeEnsNetLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetLevelResponse self = new DescribeEnsNetLevelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsNetLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsNetLevelResponse setBody(DescribeEnsNetLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetLevelResponseBody getBody() {
        return this.body;
    }

}
