// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolicStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumSymbolicStackResponseBody body;

    public static GetRumSymbolicStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolicStackResponse self = new GetRumSymbolicStackResponse();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolicStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumSymbolicStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumSymbolicStackResponse setBody(GetRumSymbolicStackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumSymbolicStackResponseBody getBody() {
        return this.body;
    }

}
