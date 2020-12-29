// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricConsortiumChannelsResponse setBody(DescribeFabricConsortiumChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumChannelsResponseBody getBody() {
        return this.body;
    }

}
