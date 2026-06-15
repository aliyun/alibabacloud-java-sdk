// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetTuneProposalByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTuneProposalByIdResponseBody body;

    public static GetTuneProposalByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTuneProposalByIdResponse self = new GetTuneProposalByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTuneProposalByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTuneProposalByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTuneProposalByIdResponse setBody(GetTuneProposalByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTuneProposalByIdResponseBody getBody() {
        return this.body;
    }

}
