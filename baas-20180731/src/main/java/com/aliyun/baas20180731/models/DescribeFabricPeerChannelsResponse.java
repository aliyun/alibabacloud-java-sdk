// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricPeerChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricPeerChannelsResponseBody body;

    public static DescribeFabricPeerChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricPeerChannelsResponse self = new DescribeFabricPeerChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricPeerChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricPeerChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricPeerChannelsResponse setBody(DescribeFabricPeerChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricPeerChannelsResponseBody getBody() {
        return this.body;
    }

}
