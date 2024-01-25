// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupJobs2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupJobs2ResponseBody body;

    public static DescribeBackupJobs2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobs2Response self = new DescribeBackupJobs2Response();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobs2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupJobs2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupJobs2Response setBody(DescribeBackupJobs2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupJobs2ResponseBody getBody() {
        return this.body;
    }

}
