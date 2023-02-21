// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcCoreTeamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcCoreTeamsResponseBody body;

    public static GetOcCoreTeamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcCoreTeamsResponse self = new GetOcCoreTeamsResponse();
        return TeaModel.build(map, self);
    }

    public GetOcCoreTeamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcCoreTeamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcCoreTeamsResponse setBody(GetOcCoreTeamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcCoreTeamsResponseBody getBody() {
        return this.body;
    }

}
