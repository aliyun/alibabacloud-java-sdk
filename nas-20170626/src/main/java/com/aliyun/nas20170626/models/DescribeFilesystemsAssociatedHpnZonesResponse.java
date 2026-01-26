// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsAssociatedHpnZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFilesystemsAssociatedHpnZonesResponseBody body;

    public static DescribeFilesystemsAssociatedHpnZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsAssociatedHpnZonesResponse self = new DescribeFilesystemsAssociatedHpnZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsAssociatedHpnZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFilesystemsAssociatedHpnZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFilesystemsAssociatedHpnZonesResponse setBody(DescribeFilesystemsAssociatedHpnZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFilesystemsAssociatedHpnZonesResponseBody getBody() {
        return this.body;
    }

}
