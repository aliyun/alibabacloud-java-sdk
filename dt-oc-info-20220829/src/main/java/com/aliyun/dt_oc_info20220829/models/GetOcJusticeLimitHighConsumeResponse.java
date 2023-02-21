// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeLimitHighConsumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeLimitHighConsumeResponseBody body;

    public static GetOcJusticeLimitHighConsumeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeLimitHighConsumeResponse self = new GetOcJusticeLimitHighConsumeResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeLimitHighConsumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeLimitHighConsumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeLimitHighConsumeResponse setBody(GetOcJusticeLimitHighConsumeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeLimitHighConsumeResponseBody getBody() {
        return this.body;
    }

}
