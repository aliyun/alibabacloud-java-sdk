// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSwitchLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceSwitchLogResponseBody body;

    public static DescribeDBInstanceSwitchLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSwitchLogResponse self = new DescribeDBInstanceSwitchLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSwitchLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSwitchLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceSwitchLogResponse setBody(DescribeDBInstanceSwitchLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSwitchLogResponseBody getBody() {
        return this.body;
    }

}
