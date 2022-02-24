// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyProfileThreeResponseBody body;

    public static GetCompanyProfileThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileThreeResponse self = new GetCompanyProfileThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyProfileThreeResponse setBody(GetCompanyProfileThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyProfileThreeResponseBody getBody() {
        return this.body;
    }

}
