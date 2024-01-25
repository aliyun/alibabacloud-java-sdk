// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslModelByTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEslModelByTemplateVersionResponseBody body;

    public static DescribeEslModelByTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslModelByTemplateVersionResponse self = new DescribeEslModelByTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEslModelByTemplateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEslModelByTemplateVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEslModelByTemplateVersionResponse setBody(DescribeEslModelByTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEslModelByTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
