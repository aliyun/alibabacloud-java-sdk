// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyJudgmentDocumentThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyJudgmentDocumentThreeResponseBody body;

    public static GetCompanyJudgmentDocumentThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyJudgmentDocumentThreeResponse self = new GetCompanyJudgmentDocumentThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyJudgmentDocumentThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyJudgmentDocumentThreeResponse setBody(GetCompanyJudgmentDocumentThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyJudgmentDocumentThreeResponseBody getBody() {
        return this.body;
    }

}
