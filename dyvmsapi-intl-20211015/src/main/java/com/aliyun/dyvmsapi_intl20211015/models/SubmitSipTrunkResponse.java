// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitSipTrunkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSipTrunkResponseBody body;

    public static SubmitSipTrunkResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSipTrunkResponse self = new SubmitSipTrunkResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSipTrunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSipTrunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSipTrunkResponse setBody(SubmitSipTrunkResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSipTrunkResponseBody getBody() {
        return this.body;
    }

}
