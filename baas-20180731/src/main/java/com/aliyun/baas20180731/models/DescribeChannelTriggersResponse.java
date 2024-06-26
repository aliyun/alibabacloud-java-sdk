// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelTriggersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelTriggersResponseBody body;

    public static DescribeChannelTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTriggersResponse self = new DescribeChannelTriggersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelTriggersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelTriggersResponse setBody(DescribeChannelTriggersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelTriggersResponseBody getBody() {
        return this.body;
    }

}
