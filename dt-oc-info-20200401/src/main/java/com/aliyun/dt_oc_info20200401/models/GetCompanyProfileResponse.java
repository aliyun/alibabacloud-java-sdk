// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyProfileResponseBody body;

    public static GetCompanyProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileResponse self = new GetCompanyProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyProfileResponse setBody(GetCompanyProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyProfileResponseBody getBody() {
        return this.body;
    }

}
