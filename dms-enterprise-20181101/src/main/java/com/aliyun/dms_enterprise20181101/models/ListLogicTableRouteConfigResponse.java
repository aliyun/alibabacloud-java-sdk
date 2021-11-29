// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTableRouteConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListLogicTableRouteConfigResponse setBody(ListLogicTableRouteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

}
