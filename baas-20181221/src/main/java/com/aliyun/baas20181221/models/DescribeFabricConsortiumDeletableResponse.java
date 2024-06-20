// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumDeletableResponseBody body;

    public static DescribeFabricConsortiumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumDeletableResponse self = new DescribeFabricConsortiumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumDeletableResponse setBody(DescribeFabricConsortiumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumDeletableResponseBody getBody() {
        return this.body;
    }

}
