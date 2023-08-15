// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMultiZoneClusterResponseBody body;

    public static CreateMultiZoneClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiZoneClusterResponse self = new CreateMultiZoneClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiZoneClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiZoneClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiZoneClusterResponse setBody(CreateMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
