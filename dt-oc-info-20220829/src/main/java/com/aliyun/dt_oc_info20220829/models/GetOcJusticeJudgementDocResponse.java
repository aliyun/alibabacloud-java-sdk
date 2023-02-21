// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeJudgementDocResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeJudgementDocResponseBody body;

    public static GetOcJusticeJudgementDocResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeJudgementDocResponse self = new GetOcJusticeJudgementDocResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeJudgementDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeJudgementDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeJudgementDocResponse setBody(GetOcJusticeJudgementDocResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeJudgementDocResponseBody getBody() {
        return this.body;
    }

}
