// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumSpecsResponseBody body;

    public static DescribeFabricConsortiumSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumSpecsResponse self = new DescribeFabricConsortiumSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumSpecsResponse setBody(DescribeFabricConsortiumSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumSpecsResponseBody getBody() {
        return this.body;
    }

}
