// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserApplicationSummariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserApplicationSummariesResponseBody body;

    public static GetUserApplicationSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationSummariesResponse self = new GetUserApplicationSummariesResponse();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserApplicationSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserApplicationSummariesResponse setBody(GetUserApplicationSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserApplicationSummariesResponseBody getBody() {
        return this.body;
    }

}
