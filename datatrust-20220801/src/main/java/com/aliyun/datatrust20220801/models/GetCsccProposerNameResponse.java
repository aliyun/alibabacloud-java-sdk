// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccProposerNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccProposerNameResponseBody body;

    public static GetCsccProposerNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccProposerNameResponse self = new GetCsccProposerNameResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccProposerNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccProposerNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccProposerNameResponse setBody(GetCsccProposerNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccProposerNameResponseBody getBody() {
        return this.body;
    }

}
