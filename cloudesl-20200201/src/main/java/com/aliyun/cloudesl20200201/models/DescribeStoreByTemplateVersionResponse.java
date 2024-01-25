// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreByTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStoreByTemplateVersionResponseBody body;

    public static DescribeStoreByTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreByTemplateVersionResponse self = new DescribeStoreByTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoreByTemplateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoreByTemplateVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStoreByTemplateVersionResponse setBody(DescribeStoreByTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoreByTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
