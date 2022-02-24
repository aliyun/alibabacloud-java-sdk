// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyChangeThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyChangeThreeResponseBody body;

    public static GetCompanyChangeThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyChangeThreeResponse self = new GetCompanyChangeThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyChangeThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyChangeThreeResponse setBody(GetCompanyChangeThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyChangeThreeResponseBody getBody() {
        return this.body;
    }

}
