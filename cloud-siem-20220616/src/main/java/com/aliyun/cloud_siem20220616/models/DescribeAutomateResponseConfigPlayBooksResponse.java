// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigPlayBooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutomateResponseConfigPlayBooksResponseBody body;

    public static DescribeAutomateResponseConfigPlayBooksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigPlayBooksResponse self = new DescribeAutomateResponseConfigPlayBooksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigPlayBooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutomateResponseConfigPlayBooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutomateResponseConfigPlayBooksResponse setBody(DescribeAutomateResponseConfigPlayBooksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutomateResponseConfigPlayBooksResponseBody getBody() {
        return this.body;
    }

}
