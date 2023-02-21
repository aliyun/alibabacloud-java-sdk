// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcProductBandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcProductBandResponseBody body;

    public static GetOcProductBandResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcProductBandResponse self = new GetOcProductBandResponse();
        return TeaModel.build(map, self);
    }

    public GetOcProductBandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcProductBandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcProductBandResponse setBody(GetOcProductBandResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcProductBandResponseBody getBody() {
        return this.body;
    }

}
