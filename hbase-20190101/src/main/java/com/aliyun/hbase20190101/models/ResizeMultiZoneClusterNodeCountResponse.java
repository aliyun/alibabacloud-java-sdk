// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public ResizeMultiZoneClusterNodeCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeMultiZoneClusterNodeCountResponse setBody(ResizeMultiZoneClusterNodeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeMultiZoneClusterNodeCountResponseBody getBody() {
        return this.body;
    }

}
