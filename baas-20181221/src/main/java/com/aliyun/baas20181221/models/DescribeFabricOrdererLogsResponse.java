// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrdererLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrdererLogsResponseBody body;

    public static DescribeFabricOrdererLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrdererLogsResponse self = new DescribeFabricOrdererLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrdererLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrdererLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrdererLogsResponse setBody(DescribeFabricOrdererLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrdererLogsResponseBody getBody() {
        return this.body;
    }

}
