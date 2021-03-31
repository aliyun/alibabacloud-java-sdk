// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudAssistantStatusResponseBody body;

    public static DescribeCloudAssistantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantStatusResponse self = new DescribeCloudAssistantStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudAssistantStatusResponse setBody(DescribeCloudAssistantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudAssistantStatusResponseBody getBody() {
        return this.body;
    }

}
