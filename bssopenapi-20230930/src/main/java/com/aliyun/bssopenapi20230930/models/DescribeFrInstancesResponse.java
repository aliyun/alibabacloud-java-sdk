// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeFrInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFrInstancesResponseBody body;

    public static DescribeFrInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrInstancesResponse self = new DescribeFrInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFrInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFrInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFrInstancesResponse setBody(DescribeFrInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFrInstancesResponseBody getBody() {
        return this.body;
    }

}
