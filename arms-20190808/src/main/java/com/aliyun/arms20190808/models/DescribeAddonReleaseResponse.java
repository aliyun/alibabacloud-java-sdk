// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAddonReleaseResponseBody body;

    public static DescribeAddonReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonReleaseResponse self = new DescribeAddonReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddonReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddonReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddonReleaseResponse setBody(DescribeAddonReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddonReleaseResponseBody getBody() {
        return this.body;
    }

}
