// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeTaskBriefInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTaskBriefInfoResponseBody body;

    public static DescribeTaskBriefInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskBriefInfoResponse self = new DescribeTaskBriefInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskBriefInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskBriefInfoResponse setBody(DescribeTaskBriefInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskBriefInfoResponseBody getBody() {
        return this.body;
    }

}
