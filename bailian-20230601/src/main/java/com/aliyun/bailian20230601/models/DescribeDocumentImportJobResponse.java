// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocumentImportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDocumentImportJobResponseBody body;

    public static DescribeDocumentImportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentImportJobResponse self = new DescribeDocumentImportJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentImportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocumentImportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocumentImportJobResponse setBody(DescribeDocumentImportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocumentImportJobResponseBody getBody() {
        return this.body;
    }

}
