// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentSubAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAgentSubAccountInfoResponseBody body;

    public static GetDataAgentSubAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentSubAccountInfoResponse self = new GetDataAgentSubAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAgentSubAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAgentSubAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAgentSubAccountInfoResponse setBody(GetDataAgentSubAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAgentSubAccountInfoResponseBody getBody() {
        return this.body;
    }

}
