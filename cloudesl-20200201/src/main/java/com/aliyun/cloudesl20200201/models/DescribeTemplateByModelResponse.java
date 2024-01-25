// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeTemplateByModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateByModelResponseBody body;

    public static DescribeTemplateByModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateByModelResponse self = new DescribeTemplateByModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateByModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateByModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateByModelResponse setBody(DescribeTemplateByModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateByModelResponseBody getBody() {
        return this.body;
    }

}
