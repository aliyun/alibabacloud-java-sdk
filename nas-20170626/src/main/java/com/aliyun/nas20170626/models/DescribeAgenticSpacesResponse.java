// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAgenticSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticSpacesResponseBody body;

    public static DescribeAgenticSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticSpacesResponse self = new DescribeAgenticSpacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticSpacesResponse setBody(DescribeAgenticSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticSpacesResponseBody getBody() {
        return this.body;
    }

}
