// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcDoubleCheckupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcDoubleCheckupResponseBody body;

    public static GetOcIcDoubleCheckupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcDoubleCheckupResponse self = new GetOcIcDoubleCheckupResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcDoubleCheckupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcDoubleCheckupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcDoubleCheckupResponse setBody(GetOcIcDoubleCheckupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcDoubleCheckupResponseBody getBody() {
        return this.body;
    }

}
