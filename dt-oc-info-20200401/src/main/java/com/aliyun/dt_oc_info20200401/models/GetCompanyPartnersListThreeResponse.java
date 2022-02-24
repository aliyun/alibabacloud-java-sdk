// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyPartnersListThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyPartnersListThreeResponseBody body;

    public static GetCompanyPartnersListThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyPartnersListThreeResponse self = new GetCompanyPartnersListThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyPartnersListThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyPartnersListThreeResponse setBody(GetCompanyPartnersListThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyPartnersListThreeResponseBody getBody() {
        return this.body;
    }

}
