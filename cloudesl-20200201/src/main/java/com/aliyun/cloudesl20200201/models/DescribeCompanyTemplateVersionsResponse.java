// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeCompanyTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCompanyTemplateVersionsResponseBody body;

    public static DescribeCompanyTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCompanyTemplateVersionsResponse self = new DescribeCompanyTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCompanyTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCompanyTemplateVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCompanyTemplateVersionsResponse setBody(DescribeCompanyTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCompanyTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
