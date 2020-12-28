// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttachmentAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAttachmentAttributesResponseBody body;

    public static DescribeInstanceAttachmentAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttachmentAttributesResponse self = new DescribeInstanceAttachmentAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttachmentAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAttachmentAttributesResponse setBody(DescribeInstanceAttachmentAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAttachmentAttributesResponseBody getBody() {
        return this.body;
    }

}
