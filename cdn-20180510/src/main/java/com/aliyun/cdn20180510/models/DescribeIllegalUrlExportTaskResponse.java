// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIllegalUrlExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIllegalUrlExportTaskResponseBody body;

    public static DescribeIllegalUrlExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIllegalUrlExportTaskResponse self = new DescribeIllegalUrlExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIllegalUrlExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIllegalUrlExportTaskResponse setBody(DescribeIllegalUrlExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIllegalUrlExportTaskResponseBody getBody() {
        return this.body;
    }

}
