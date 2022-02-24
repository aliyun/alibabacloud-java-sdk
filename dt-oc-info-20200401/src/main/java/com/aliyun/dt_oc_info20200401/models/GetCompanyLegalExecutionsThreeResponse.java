// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyLegalExecutionsThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyLegalExecutionsThreeResponseBody body;

    public static GetCompanyLegalExecutionsThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyLegalExecutionsThreeResponse self = new GetCompanyLegalExecutionsThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyLegalExecutionsThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyLegalExecutionsThreeResponse setBody(GetCompanyLegalExecutionsThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyLegalExecutionsThreeResponseBody getBody() {
        return this.body;
    }

}
