// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLaunchTemplateVersionsResponseBody body;

    public static DescribeLaunchTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsResponse self = new DescribeLaunchTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLaunchTemplateVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLaunchTemplateVersionsResponse setBody(DescribeLaunchTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLaunchTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
