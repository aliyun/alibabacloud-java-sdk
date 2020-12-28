// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLaunchTemplateVersionsResponse setBody(DescribeLaunchTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLaunchTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
