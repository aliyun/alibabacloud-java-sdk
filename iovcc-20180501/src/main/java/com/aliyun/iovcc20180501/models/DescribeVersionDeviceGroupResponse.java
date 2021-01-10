// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeVersionDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVersionDeviceGroupResponseBody body;

    public static DescribeVersionDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionDeviceGroupResponse self = new DescribeVersionDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVersionDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVersionDeviceGroupResponse setBody(DescribeVersionDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
