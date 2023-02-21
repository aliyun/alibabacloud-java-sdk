// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpPatentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpPatentResponseBody body;

    public static GetOcIpPatentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpPatentResponse self = new GetOcIpPatentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpPatentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpPatentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpPatentResponse setBody(GetOcIpPatentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpPatentResponseBody getBody() {
        return this.body;
    }

}
