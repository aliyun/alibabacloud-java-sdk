// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeUpgradeDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUpgradeDownloadInfoResponseBody body;

    public static DescribeUpgradeDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeDownloadInfoResponse self = new DescribeUpgradeDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpgradeDownloadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpgradeDownloadInfoResponse setBody(DescribeUpgradeDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpgradeDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
