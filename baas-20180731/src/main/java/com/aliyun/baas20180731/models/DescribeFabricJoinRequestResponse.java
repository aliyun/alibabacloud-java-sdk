// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricJoinRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricJoinRequestResponseBody body;

    public static DescribeFabricJoinRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricJoinRequestResponse self = new DescribeFabricJoinRequestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricJoinRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricJoinRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricJoinRequestResponse setBody(DescribeFabricJoinRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricJoinRequestResponseBody getBody() {
        return this.body;
    }

}
