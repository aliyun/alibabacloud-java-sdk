// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumChannelsResponseBody body;

    public static DescribeConsortiumChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumChannelsResponse self = new DescribeConsortiumChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumChannelsResponse setBody(DescribeConsortiumChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumChannelsResponseBody getBody() {
        return this.body;
    }

}
