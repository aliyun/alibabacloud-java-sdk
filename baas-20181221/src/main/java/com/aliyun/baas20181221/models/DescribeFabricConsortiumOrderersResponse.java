// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumOrderersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumOrderersResponseBody body;

    public static DescribeFabricConsortiumOrderersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumOrderersResponse self = new DescribeFabricConsortiumOrderersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumOrderersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumOrderersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumOrderersResponse setBody(DescribeFabricConsortiumOrderersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumOrderersResponseBody getBody() {
        return this.body;
    }

}
