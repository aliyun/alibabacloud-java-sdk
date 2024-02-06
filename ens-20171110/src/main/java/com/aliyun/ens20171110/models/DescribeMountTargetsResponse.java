// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMountTargetsResponseBody body;

    public static DescribeMountTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponse self = new DescribeMountTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMountTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMountTargetsResponse setBody(DescribeMountTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMountTargetsResponseBody getBody() {
        return this.body;
    }

}
