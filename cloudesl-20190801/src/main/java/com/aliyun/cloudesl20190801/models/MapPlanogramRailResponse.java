// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class MapPlanogramRailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MapPlanogramRailResponseBody body;

    public static MapPlanogramRailResponse build(java.util.Map<String, ?> map) throws Exception {
        MapPlanogramRailResponse self = new MapPlanogramRailResponse();
        return TeaModel.build(map, self);
    }

    public MapPlanogramRailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapPlanogramRailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MapPlanogramRailResponse setBody(MapPlanogramRailResponseBody body) {
        this.body = body;
        return this;
    }
    public MapPlanogramRailResponseBody getBody() {
        return this.body;
    }

}
