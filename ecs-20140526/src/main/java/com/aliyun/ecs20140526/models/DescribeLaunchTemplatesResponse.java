// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLaunchTemplatesResponseBody body;

    public static DescribeLaunchTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesResponse self = new DescribeLaunchTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLaunchTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLaunchTemplatesResponse setBody(DescribeLaunchTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLaunchTemplatesResponseBody getBody() {
        return this.body;
    }

}
