// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeModelRelationScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelRelationScenesResponseBody body;

    public static DescribeModelRelationScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelRelationScenesResponse self = new DescribeModelRelationScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelRelationScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelRelationScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelRelationScenesResponse setBody(DescribeModelRelationScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelRelationScenesResponseBody getBody() {
        return this.body;
    }

}
