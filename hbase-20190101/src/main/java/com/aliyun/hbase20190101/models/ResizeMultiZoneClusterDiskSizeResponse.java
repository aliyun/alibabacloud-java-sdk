// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterDiskSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeMultiZoneClusterDiskSizeResponseBody body;

    public static ResizeMultiZoneClusterDiskSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterDiskSizeResponse self = new ResizeMultiZoneClusterDiskSizeResponse();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterDiskSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeMultiZoneClusterDiskSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeMultiZoneClusterDiskSizeResponse setBody(ResizeMultiZoneClusterDiskSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeMultiZoneClusterDiskSizeResponseBody getBody() {
        return this.body;
    }

}
