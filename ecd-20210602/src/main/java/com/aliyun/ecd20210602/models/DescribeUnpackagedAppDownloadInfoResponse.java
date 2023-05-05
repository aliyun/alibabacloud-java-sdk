// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeUnpackagedAppDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUnpackagedAppDownloadInfoResponseBody body;

    public static DescribeUnpackagedAppDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnpackagedAppDownloadInfoResponse self = new DescribeUnpackagedAppDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnpackagedAppDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnpackagedAppDownloadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnpackagedAppDownloadInfoResponse setBody(DescribeUnpackagedAppDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnpackagedAppDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
