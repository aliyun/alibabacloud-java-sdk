// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataExportSrcDstTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomDataExportSrcDstTablesResponseBody body;

    public static DescribeCustomDataExportSrcDstTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataExportSrcDstTablesResponse self = new DescribeCustomDataExportSrcDstTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataExportSrcDstTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomDataExportSrcDstTablesResponse setBody(DescribeCustomDataExportSrcDstTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomDataExportSrcDstTablesResponseBody getBody() {
        return this.body;
    }

}
