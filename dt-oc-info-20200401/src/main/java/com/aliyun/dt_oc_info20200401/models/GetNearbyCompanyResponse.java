// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetNearbyCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNearbyCompanyResponseBody body;

    public static GetNearbyCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNearbyCompanyResponse self = new GetNearbyCompanyResponse();
        return TeaModel.build(map, self);
    }

    public GetNearbyCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNearbyCompanyResponse setBody(GetNearbyCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNearbyCompanyResponseBody getBody() {
        return this.body;
    }

}
