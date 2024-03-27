// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLogicTableRouteConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLogicTableRouteConfigResponseBody body;

    public static AddLogicTableRouteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLogicTableRouteConfigResponse self = new AddLogicTableRouteConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLogicTableRouteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLogicTableRouteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLogicTableRouteConfigResponse setBody(AddLogicTableRouteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

}
