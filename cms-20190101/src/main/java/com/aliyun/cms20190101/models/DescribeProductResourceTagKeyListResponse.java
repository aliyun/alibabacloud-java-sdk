// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductResourceTagKeyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductResourceTagKeyListResponseBody body;

    public static DescribeProductResourceTagKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResourceTagKeyListResponse self = new DescribeProductResourceTagKeyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductResourceTagKeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductResourceTagKeyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductResourceTagKeyListResponse setBody(DescribeProductResourceTagKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductResourceTagKeyListResponseBody getBody() {
        return this.body;
    }

}
