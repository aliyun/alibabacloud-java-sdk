// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricManagementChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricManagementChaincodesResponseBody body;

    public static DescribeFabricManagementChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricManagementChaincodesResponse self = new DescribeFabricManagementChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricManagementChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricManagementChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricManagementChaincodesResponse setBody(DescribeFabricManagementChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricManagementChaincodesResponseBody getBody() {
        return this.body;
    }

}
