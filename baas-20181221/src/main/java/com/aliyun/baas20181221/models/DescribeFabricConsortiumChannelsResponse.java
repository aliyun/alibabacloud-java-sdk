// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumChannelsResponseBody body;

    public static DescribeFabricConsortiumChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumChannelsResponse self = new DescribeFabricConsortiumChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumChannelsResponse setBody(DescribeFabricConsortiumChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumChannelsResponseBody getBody() {
        return this.body;
    }

}
