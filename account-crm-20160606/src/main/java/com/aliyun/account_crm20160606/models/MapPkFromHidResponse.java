// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkFromHidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MapPkFromHidResponseBody body;

    public static MapPkFromHidResponse build(java.util.Map<String, ?> map) throws Exception {
        MapPkFromHidResponse self = new MapPkFromHidResponse();
        return TeaModel.build(map, self);
    }

    public MapPkFromHidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapPkFromHidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MapPkFromHidResponse setBody(MapPkFromHidResponseBody body) {
        this.body = body;
        return this;
    }
    public MapPkFromHidResponseBody getBody() {
        return this.body;
    }

}
