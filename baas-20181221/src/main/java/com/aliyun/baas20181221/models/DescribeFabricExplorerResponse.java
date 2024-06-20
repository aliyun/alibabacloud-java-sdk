// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricExplorerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricExplorerResponseBody body;

    public static DescribeFabricExplorerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricExplorerResponse self = new DescribeFabricExplorerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricExplorerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricExplorerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricExplorerResponse setBody(DescribeFabricExplorerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricExplorerResponseBody getBody() {
        return this.body;
    }

}
