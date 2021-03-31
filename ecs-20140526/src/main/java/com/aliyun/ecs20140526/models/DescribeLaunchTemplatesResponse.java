// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLaunchTemplatesResponse setBody(DescribeLaunchTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLaunchTemplatesResponseBody getBody() {
        return this.body;
    }

}
