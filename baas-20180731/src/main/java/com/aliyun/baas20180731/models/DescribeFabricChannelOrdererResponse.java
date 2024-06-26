// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelOrdererResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChannelOrdererResponseBody body;

    public static DescribeFabricChannelOrdererResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelOrdererResponse self = new DescribeFabricChannelOrdererResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelOrdererResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChannelOrdererResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChannelOrdererResponse setBody(DescribeFabricChannelOrdererResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChannelOrdererResponseBody getBody() {
        return this.body;
    }

}
