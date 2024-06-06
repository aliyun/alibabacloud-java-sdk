// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetReductionProposalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReductionProposalResponseBody body;

    public static GetReductionProposalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReductionProposalResponse self = new GetReductionProposalResponse();
        return TeaModel.build(map, self);
    }

    public GetReductionProposalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReductionProposalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReductionProposalResponse setBody(GetReductionProposalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReductionProposalResponseBody getBody() {
        return this.body;
    }

}
