// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicTableRouteConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogicTableRouteConfigResponseBody body;

    public static DeleteLogicTableRouteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicTableRouteConfigResponse self = new DeleteLogicTableRouteConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogicTableRouteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogicTableRouteConfigResponse setBody(DeleteLogicTableRouteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

}
