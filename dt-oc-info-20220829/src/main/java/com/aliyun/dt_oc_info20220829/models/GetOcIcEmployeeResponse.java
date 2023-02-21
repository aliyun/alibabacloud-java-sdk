// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcEmployeeResponseBody body;

    public static GetOcIcEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcEmployeeResponse self = new GetOcIcEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcEmployeeResponse setBody(GetOcIcEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcEmployeeResponseBody getBody() {
        return this.body;
    }

}
