// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyJudgmentDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyJudgmentDocumentResponseBody body;

    public static GetCompanyJudgmentDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyJudgmentDocumentResponse self = new GetCompanyJudgmentDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyJudgmentDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyJudgmentDocumentResponse setBody(GetCompanyJudgmentDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyJudgmentDocumentResponseBody getBody() {
        return this.body;
    }

}
