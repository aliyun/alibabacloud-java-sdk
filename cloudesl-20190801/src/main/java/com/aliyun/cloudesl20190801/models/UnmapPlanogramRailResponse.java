// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnmapPlanogramRailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnmapPlanogramRailResponseBody body;

    public static UnmapPlanogramRailResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmapPlanogramRailResponse self = new UnmapPlanogramRailResponse();
        return TeaModel.build(map, self);
    }

    public UnmapPlanogramRailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmapPlanogramRailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnmapPlanogramRailResponse setBody(UnmapPlanogramRailResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmapPlanogramRailResponseBody getBody() {
        return this.body;
    }

}
