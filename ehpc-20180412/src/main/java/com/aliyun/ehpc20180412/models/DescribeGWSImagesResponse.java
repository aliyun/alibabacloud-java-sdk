// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGWSImagesResponseBody body;

    public static DescribeGWSImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSImagesResponse self = new DescribeGWSImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGWSImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGWSImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGWSImagesResponse setBody(DescribeGWSImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSImagesResponseBody getBody() {
        return this.body;
    }

}
