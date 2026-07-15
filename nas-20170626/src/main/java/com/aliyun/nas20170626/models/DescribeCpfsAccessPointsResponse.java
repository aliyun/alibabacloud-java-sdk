// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeCpfsAccessPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCpfsAccessPointsResponseBody body;

    public static DescribeCpfsAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCpfsAccessPointsResponse self = new DescribeCpfsAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCpfsAccessPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCpfsAccessPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCpfsAccessPointsResponse setBody(DescribeCpfsAccessPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCpfsAccessPointsResponseBody getBody() {
        return this.body;
    }

}
