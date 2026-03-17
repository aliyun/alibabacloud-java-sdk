// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeContainerResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerResourceResponseBody body;

    public static DescribeContainerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerResourceResponse self = new DescribeContainerResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerResourceResponse setBody(DescribeContainerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerResourceResponseBody getBody() {
        return this.body;
    }

}
