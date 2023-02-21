// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetQccCertificationDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQccCertificationDetailByIdResponseBody body;

    public static GetQccCertificationDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQccCertificationDetailByIdResponse self = new GetQccCertificationDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetQccCertificationDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQccCertificationDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQccCertificationDetailByIdResponse setBody(GetQccCertificationDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQccCertificationDetailByIdResponseBody getBody() {
        return this.body;
    }

}
