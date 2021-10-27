// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDataImportDbTopologysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEvaluateDataImportDbTopologysResponseBody body;

    public static DescribeEvaluateDataImportDbTopologysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDataImportDbTopologysResponse self = new DescribeEvaluateDataImportDbTopologysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDataImportDbTopologysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateDataImportDbTopologysResponse setBody(DescribeEvaluateDataImportDbTopologysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateDataImportDbTopologysResponseBody getBody() {
        return this.body;
    }

}
