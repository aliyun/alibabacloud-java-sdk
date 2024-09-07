// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DescribeAddonTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAddonTemplateResponseBody body;

    public static DescribeAddonTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonTemplateResponse self = new DescribeAddonTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddonTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddonTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddonTemplateResponse setBody(DescribeAddonTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddonTemplateResponseBody getBody() {
        return this.body;
    }

}
