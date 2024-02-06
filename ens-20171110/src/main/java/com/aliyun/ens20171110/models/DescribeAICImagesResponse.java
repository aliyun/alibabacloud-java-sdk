// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAICImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAICImagesResponseBody body;

    public static DescribeAICImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICImagesResponse self = new DescribeAICImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAICImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAICImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAICImagesResponse setBody(DescribeAICImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAICImagesResponseBody getBody() {
        return this.body;
    }

}
