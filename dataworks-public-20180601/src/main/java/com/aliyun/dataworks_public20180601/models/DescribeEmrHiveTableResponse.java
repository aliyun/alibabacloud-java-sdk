// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DescribeEmrHiveTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEmrHiveTableResponseBody body;

    public static DescribeEmrHiveTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmrHiveTableResponse self = new DescribeEmrHiveTableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmrHiveTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmrHiveTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmrHiveTableResponse setBody(DescribeEmrHiveTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmrHiveTableResponseBody getBody() {
        return this.body;
    }

}
