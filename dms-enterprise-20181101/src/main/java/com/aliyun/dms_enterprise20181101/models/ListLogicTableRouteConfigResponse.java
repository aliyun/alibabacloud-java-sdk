// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTableRouteConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogicTableRouteConfigResponseBody body;

    public static ListLogicTableRouteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTableRouteConfigResponse self = new ListLogicTableRouteConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListLogicTableRouteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogicTableRouteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogicTableRouteConfigResponse setBody(ListLogicTableRouteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

}
