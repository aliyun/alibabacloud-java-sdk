// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ReportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ReportTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskStatusResponse self = new ReportTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
