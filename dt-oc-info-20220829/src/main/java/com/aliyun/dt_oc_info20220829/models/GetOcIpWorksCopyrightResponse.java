// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpWorksCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpWorksCopyrightResponseBody body;

    public static GetOcIpWorksCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpWorksCopyrightResponse self = new GetOcIpWorksCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpWorksCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpWorksCopyrightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpWorksCopyrightResponse setBody(GetOcIpWorksCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpWorksCopyrightResponseBody getBody() {
        return this.body;
    }

}
