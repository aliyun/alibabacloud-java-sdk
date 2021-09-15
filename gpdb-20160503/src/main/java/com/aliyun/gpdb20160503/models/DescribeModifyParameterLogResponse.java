// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModifyParameterLogResponseBody body;

    public static DescribeModifyParameterLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponse self = new DescribeModifyParameterLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModifyParameterLogResponse setBody(DescribeModifyParameterLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModifyParameterLogResponseBody getBody() {
        return this.body;
    }

}
