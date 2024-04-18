// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupPlanConfigResponseBody body;

    public static DescribeBackupPlanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanConfigResponse self = new DescribeBackupPlanConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPlanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPlanConfigResponse setBody(DescribeBackupPlanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPlanConfigResponseBody getBody() {
        return this.body;
    }

}
