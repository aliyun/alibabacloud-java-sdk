// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvancedBackupStatusResponseBody body;

    public static DescribeAdvancedBackupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupStatusResponse self = new DescribeAdvancedBackupStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvancedBackupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvancedBackupStatusResponse setBody(DescribeAdvancedBackupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvancedBackupStatusResponseBody getBody() {
        return this.body;
    }

}
