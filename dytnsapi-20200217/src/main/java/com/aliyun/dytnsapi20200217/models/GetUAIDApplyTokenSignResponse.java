// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class GetUAIDApplyTokenSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUAIDApplyTokenSignResponseBody body;

    public static GetUAIDApplyTokenSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUAIDApplyTokenSignResponse self = new GetUAIDApplyTokenSignResponse();
        return TeaModel.build(map, self);
    }

    public GetUAIDApplyTokenSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUAIDApplyTokenSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUAIDApplyTokenSignResponse setBody(GetUAIDApplyTokenSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUAIDApplyTokenSignResponseBody getBody() {
        return this.body;
    }

}
