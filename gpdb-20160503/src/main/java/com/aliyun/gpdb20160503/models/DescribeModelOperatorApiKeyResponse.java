// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelOperatorApiKeyResponseBody body;

    public static DescribeModelOperatorApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorApiKeyResponse self = new DescribeModelOperatorApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelOperatorApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelOperatorApiKeyResponse setBody(DescribeModelOperatorApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelOperatorApiKeyResponseBody getBody() {
        return this.body;
    }

}
