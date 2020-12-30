// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeMetaTablePreviewTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetaTablePreviewTaskResponseBody body;

    public static DescribeMetaTablePreviewTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaTablePreviewTaskResponse self = new DescribeMetaTablePreviewTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetaTablePreviewTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetaTablePreviewTaskResponse setBody(DescribeMetaTablePreviewTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetaTablePreviewTaskResponseBody getBody() {
        return this.body;
    }

}
