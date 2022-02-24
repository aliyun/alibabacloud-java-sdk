// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyLegalCaseThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyLegalCaseThreeResponseBody body;

    public static GetCompanyLegalCaseThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyLegalCaseThreeResponse self = new GetCompanyLegalCaseThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyLegalCaseThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyLegalCaseThreeResponse setBody(GetCompanyLegalCaseThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyLegalCaseThreeResponseBody getBody() {
        return this.body;
    }

}
