// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricPeerLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricPeerLogsResponseBody body;

    public static DescribeFabricPeerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricPeerLogsResponse self = new DescribeFabricPeerLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricPeerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricPeerLogsResponse setBody(DescribeFabricPeerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricPeerLogsResponseBody getBody() {
        return this.body;
    }

}
