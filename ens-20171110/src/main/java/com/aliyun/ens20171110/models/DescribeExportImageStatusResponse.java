// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExportImageStatusResponseBody body;

    public static DescribeExportImageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageStatusResponse self = new DescribeExportImageStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportImageStatusResponse setBody(DescribeExportImageStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportImageStatusResponseBody getBody() {
        return this.body;
    }

}
