// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumConfigResponseBody body;

    public static DescribeFabricConsortiumConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumConfigResponse self = new DescribeFabricConsortiumConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumConfigResponse setBody(DescribeFabricConsortiumConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumConfigResponseBody getBody() {
        return this.body;
    }

}
