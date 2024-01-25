// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeImportOASTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImportOASTaskResponseBody body;

    public static DescribeImportOASTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportOASTaskResponse self = new DescribeImportOASTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportOASTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportOASTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportOASTaskResponse setBody(DescribeImportOASTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportOASTaskResponseBody getBody() {
        return this.body;
    }

}
