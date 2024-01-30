// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetPotentialFailZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPotentialFailZonesResponseBody body;

    public static GetPotentialFailZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPotentialFailZonesResponse self = new GetPotentialFailZonesResponse();
        return TeaModel.build(map, self);
    }

    public GetPotentialFailZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPotentialFailZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPotentialFailZonesResponse setBody(GetPotentialFailZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPotentialFailZonesResponseBody getBody() {
        return this.body;
    }

}
