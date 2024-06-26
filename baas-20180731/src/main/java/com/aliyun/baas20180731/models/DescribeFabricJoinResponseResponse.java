// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricJoinResponseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricJoinResponseResponseBody body;

    public static DescribeFabricJoinResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricJoinResponseResponse self = new DescribeFabricJoinResponseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricJoinResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricJoinResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricJoinResponseResponse setBody(DescribeFabricJoinResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricJoinResponseResponseBody getBody() {
        return this.body;
    }

}
