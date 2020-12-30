// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeMultiZoneClusterNodeCountResponseBody body;

    public static ResizeMultiZoneClusterNodeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterNodeCountResponse self = new ResizeMultiZoneClusterNodeCountResponse();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterNodeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeMultiZoneClusterNodeCountResponse setBody(ResizeMultiZoneClusterNodeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeMultiZoneClusterNodeCountResponseBody getBody() {
        return this.body;
    }

}
