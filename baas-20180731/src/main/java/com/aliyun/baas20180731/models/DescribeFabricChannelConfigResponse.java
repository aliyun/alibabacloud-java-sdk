// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChannelConfigResponseBody body;

    public static DescribeFabricChannelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelConfigResponse self = new DescribeFabricChannelConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChannelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChannelConfigResponse setBody(DescribeFabricChannelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChannelConfigResponseBody getBody() {
        return this.body;
    }

}
