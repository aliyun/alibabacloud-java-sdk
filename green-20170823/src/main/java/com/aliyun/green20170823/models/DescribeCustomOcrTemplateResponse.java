// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCustomOcrTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomOcrTemplateResponseBody body;

    public static DescribeCustomOcrTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomOcrTemplateResponse self = new DescribeCustomOcrTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomOcrTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomOcrTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomOcrTemplateResponse setBody(DescribeCustomOcrTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomOcrTemplateResponseBody getBody() {
        return this.body;
    }

}
