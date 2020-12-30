// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupGatewayListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupGatewayListResponseBody body;

    public static DescribeBackupGatewayListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupGatewayListResponse self = new DescribeBackupGatewayListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupGatewayListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupGatewayListResponse setBody(DescribeBackupGatewayListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupGatewayListResponseBody getBody() {
        return this.body;
    }

}
