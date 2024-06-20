// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumChaincodesResponseBody body;

    public static DescribeFabricConsortiumChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumChaincodesResponse self = new DescribeFabricConsortiumChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumChaincodesResponse setBody(DescribeFabricConsortiumChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumChaincodesResponseBody getBody() {
        return this.body;
    }

}
