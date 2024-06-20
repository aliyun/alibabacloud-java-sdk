// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInviterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricInviterResponseBody body;

    public static DescribeFabricInviterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInviterResponse self = new DescribeFabricInviterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInviterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricInviterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricInviterResponse setBody(DescribeFabricInviterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricInviterResponseBody getBody() {
        return this.body;
    }

}
