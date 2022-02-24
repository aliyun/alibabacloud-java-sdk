// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyPartnersListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyPartnersListResponseBody body;

    public static GetCompanyPartnersListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyPartnersListResponse self = new GetCompanyPartnersListResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyPartnersListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyPartnersListResponse setBody(GetCompanyPartnersListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyPartnersListResponseBody getBody() {
        return this.body;
    }

}
