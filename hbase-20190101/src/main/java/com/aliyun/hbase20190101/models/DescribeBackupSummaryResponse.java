// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeBackupSummaryResponse setBody(DescribeBackupSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSummaryResponseBody getBody() {
        return this.body;
    }

}
