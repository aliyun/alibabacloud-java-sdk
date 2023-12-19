// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreJobs2ResponseBody body;

    public static DescribeRestoreJobs2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobs2Response self = new DescribeRestoreJobs2Response();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobs2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreJobs2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreJobs2Response setBody(DescribeRestoreJobs2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreJobs2ResponseBody getBody() {
        return this.body;
    }

}
