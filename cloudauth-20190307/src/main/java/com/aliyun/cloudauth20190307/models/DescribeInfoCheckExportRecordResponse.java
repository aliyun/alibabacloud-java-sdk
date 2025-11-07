// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeInfoCheckExportRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInfoCheckExportRecordResponseBody body;

    public static DescribeInfoCheckExportRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInfoCheckExportRecordResponse self = new DescribeInfoCheckExportRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInfoCheckExportRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInfoCheckExportRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInfoCheckExportRecordResponse setBody(DescribeInfoCheckExportRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInfoCheckExportRecordResponseBody getBody() {
        return this.body;
    }

}
