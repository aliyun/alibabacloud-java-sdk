// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceDiagnosisSummaryResponseBody body;

    public static DescribeDBInstanceDiagnosisSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDiagnosisSummaryResponse self = new DescribeDBInstanceDiagnosisSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDiagnosisSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceDiagnosisSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceDiagnosisSummaryResponse setBody(DescribeDBInstanceDiagnosisSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDiagnosisSummaryResponseBody getBody() {
        return this.body;
    }

}
