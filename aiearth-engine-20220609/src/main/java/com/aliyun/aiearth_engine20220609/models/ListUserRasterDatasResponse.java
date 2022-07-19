// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserRasterDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserRasterDatasResponseBody body;

    public static ListUserRasterDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserRasterDatasResponse self = new ListUserRasterDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListUserRasterDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserRasterDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserRasterDatasResponse setBody(ListUserRasterDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserRasterDatasResponseBody getBody() {
        return this.body;
    }

}
