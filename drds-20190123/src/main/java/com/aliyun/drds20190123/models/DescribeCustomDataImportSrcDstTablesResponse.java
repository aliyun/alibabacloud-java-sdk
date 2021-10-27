// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataImportSrcDstTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomDataImportSrcDstTablesResponseBody body;

    public static DescribeCustomDataImportSrcDstTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataImportSrcDstTablesResponse self = new DescribeCustomDataImportSrcDstTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataImportSrcDstTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomDataImportSrcDstTablesResponse setBody(DescribeCustomDataImportSrcDstTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomDataImportSrcDstTablesResponseBody getBody() {
        return this.body;
    }

}
