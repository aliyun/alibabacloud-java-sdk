// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResultExportConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResultExportConfigResponseBody body;

    public static DescribeResultExportConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultExportConfigResponse self = new DescribeResultExportConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResultExportConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResultExportConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResultExportConfigResponse setBody(DescribeResultExportConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResultExportConfigResponseBody getBody() {
        return this.body;
    }

}
