// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetBusAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusAppConfigResponseBody body;

    public static GetBusAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusAppConfigResponse self = new GetBusAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBusAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusAppConfigResponse setBody(GetBusAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusAppConfigResponseBody getBody() {
        return this.body;
    }

}
