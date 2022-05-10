// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeModifyConfigLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModifyConfigLogResponseBody body;

    public static DescribeModifyConfigLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyConfigLogResponse self = new DescribeModifyConfigLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModifyConfigLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModifyConfigLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModifyConfigLogResponse setBody(DescribeModifyConfigLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModifyConfigLogResponseBody getBody() {
        return this.body;
    }

}
