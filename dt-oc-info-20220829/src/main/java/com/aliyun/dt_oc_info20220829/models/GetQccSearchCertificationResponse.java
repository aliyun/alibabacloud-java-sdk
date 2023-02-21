// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetQccSearchCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQccSearchCertificationResponseBody body;

    public static GetQccSearchCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQccSearchCertificationResponse self = new GetQccSearchCertificationResponse();
        return TeaModel.build(map, self);
    }

    public GetQccSearchCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQccSearchCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQccSearchCertificationResponse setBody(GetQccSearchCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQccSearchCertificationResponseBody getBody() {
        return this.body;
    }

}
