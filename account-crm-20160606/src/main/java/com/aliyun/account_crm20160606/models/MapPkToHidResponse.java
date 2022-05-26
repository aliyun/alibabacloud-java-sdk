// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkToHidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MapPkToHidResponseBody body;

    public static MapPkToHidResponse build(java.util.Map<String, ?> map) throws Exception {
        MapPkToHidResponse self = new MapPkToHidResponse();
        return TeaModel.build(map, self);
    }

    public MapPkToHidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapPkToHidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MapPkToHidResponse setBody(MapPkToHidResponseBody body) {
        this.body = body;
        return this;
    }
    public MapPkToHidResponseBody getBody() {
        return this.body;
    }

}
