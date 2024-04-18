// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupSummaryResponseBody body;

    public static DescribeBackupSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSummaryResponse self = new DescribeBackupSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupSummaryResponse setBody(DescribeBackupSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSummaryResponseBody getBody() {
        return this.body;
    }

}
