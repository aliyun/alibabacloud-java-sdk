// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetLhmDWResourceGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLhmDWResourceGroupStatusResponseBody body;

    public static GetLhmDWResourceGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLhmDWResourceGroupStatusResponse self = new GetLhmDWResourceGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLhmDWResourceGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLhmDWResourceGroupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLhmDWResourceGroupStatusResponse setBody(GetLhmDWResourceGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLhmDWResourceGroupStatusResponseBody getBody() {
        return this.body;
    }

}
