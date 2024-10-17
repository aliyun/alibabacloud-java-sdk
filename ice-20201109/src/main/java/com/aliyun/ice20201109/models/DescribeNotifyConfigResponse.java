// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNotifyConfigResponseBody body;

    public static DescribeNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyConfigResponse self = new DescribeNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNotifyConfigResponse setBody(DescribeNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
