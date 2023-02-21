// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeExecutedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeExecutedResponseBody body;

    public static GetOcJusticeExecutedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeExecutedResponse self = new GetOcJusticeExecutedResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeExecutedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeExecutedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeExecutedResponse setBody(GetOcJusticeExecutedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeExecutedResponseBody getBody() {
        return this.body;
    }

}
